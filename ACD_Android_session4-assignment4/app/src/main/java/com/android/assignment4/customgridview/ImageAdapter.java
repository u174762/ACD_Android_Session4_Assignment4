package com.android.vicky.customgridviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {

    private Context context;
    private final String[] mobileValues;

    public ImageAdapter(Context context, String[] mobileValues) {
        this.context = context;
        this.mobileValues = mobileValues;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;

        if (convertView == null) {
            gridView = new View(context);

            // get layout from mobile.xml
            gridView = inflater.inflate(R.layout.lis_mobile, null);

            // set value into textview
            TextView textView = (TextView) gridView.findViewById(R.id.label);
            textView.setText(mobileValues[position]);

            // set image based on selected text
            ImageView imageView = (ImageView) gridView.findViewById(R.id.logo);

            String mobile = mobileValues[position];

            if (mobile.equals("GingerBread")) {
                imageView.setImageResource(R.drawable.ginger_bread);
            } else if (mobile.equals("Honeycomb")) {
                imageView.setImageResource(R.drawable.honeycomb);
            } else if (mobile.equals("IceCreamSandwich")) {
                imageView.setImageResource(R.drawable.ics);
            }  else if (mobile.equals("JellyBean")) {
                imageView.setImageResource(R.drawable.jelly_bean);
            }  else if (mobile.equals("Kitkat")) {
                imageView.setImageResource(R.drawable.kitkat);
            }  else {
                imageView.setImageResource(R.drawable.lollipop);
            }

        } else {
            gridView = (View) convertView;
        }

        return gridView;
    }

    @Override
    public int getCount() {
        return mobileValues.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}
