package com.example.as_c4_lab1_task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   public void goToList(View v)
    {
        Intent intent = new Intent(this, MainActivityList.class);
        startActivity(intent);
    }
}