package com.android.vicky.customgridviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class GridViewCustom extends AppCompatActivity {
    GridView showGrid;
    static final String[] Android_Version = new String[] {
            "GingerBread", "Honeycomb","IceCreamSandwich", "JellyBean", "Kitkat", "Lollipop" };
    static final String[] imgName= new String[]{
            "Ginger Bread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "Jelly Bean",
            "Kitkat",
            "Lollipop",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_custom);

        showGrid=(GridView)findViewById(R.id.customgridview);
        showGrid.setAdapter(new ImageAdapter(this, Android_Version));

        showGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                String selectedImageName = imgName[position];
                Toast.makeText(getApplicationContext(), selectedImageName + " Logo", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
