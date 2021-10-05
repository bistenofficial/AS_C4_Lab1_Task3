package com.example.as_c4_lab1_task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivityList extends AppCompatActivity {
ArrayList<Cook> cooks = new ArrayList();
    ListView cookList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);
        setInitialData();
        cookList = (ListView) findViewById(R.id.cookList);
        StateAdapter stateAdapter = new StateAdapter(this, R.layout.list_item, cooks);
        cookList.setAdapter(stateAdapter);
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Cook selectState = (Cook) parent.getItemAtPosition(position);
                Toast toast = Toast.makeText(getApplicationContext(), "Был выбран пункт " + selectState.getName(), Toast.LENGTH_SHORT);
                toast.show();
                Intent intent = new Intent(MainActivityList.this, ActivityInfo.class);
                intent.putExtra("name",selectState.getName());
                startActivity(intent);
            }
        };
        cookList.setOnItemClickListener(itemListener);
    }
    public void goToBack(View v)
    {
        Intent intent = new Intent(MainActivityList.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    private void setInitialData()
    {
        cooks.add(new Cook("Blinchik",R.drawable.ic_blinchik));
        cooks.add(new Cook("Borsch",R.drawable.ic_borsch));
        cooks.add(new Cook("Cesar",R.drawable.ic_cesar));
        cooks.add(new Cook("Milkshake",R.drawable.ic_milkshake));
        cooks.add(new Cook("Spagetti",R.drawable.ic_spagetti));
    }
    }
