package com.example.as_c4_lab1_task3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class StateAdapter extends ArrayAdapter<Cook>
{
    private LayoutInflater inflater;
    private int layout;
    private List<Cook> cooks;
    public StateAdapter(Context context,int resource,List<Cook> cooks)
    {
        super(context,resource,cooks);
        this.inflater = LayoutInflater.from(context);
        this.layout = resource;
        this.cooks = cooks;
    }
    public View getView (int position, View convertView, ViewGroup parent)
    {
        View view = inflater.inflate(this.layout,parent,false);
        ImageView flagView = (ImageView) view.findViewById(R.id.imageView_cook);
        TextView nameView = (TextView) view.findViewById(R.id.textView_Name);

        Cook cook = cooks.get(position);
        flagView.setImageResource(cook.getResource());
        nameView.setText(cook.getName());
        return view;
    }
}
