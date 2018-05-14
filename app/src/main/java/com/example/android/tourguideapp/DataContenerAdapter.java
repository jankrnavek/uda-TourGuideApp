package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class DataContenerAdapter extends ArrayAdapter<DataContener> {

    private Context context = getContext();

    public DataContenerAdapter(Activity context, ArrayList<DataContener> w) {
        super(context, 0, w);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        DataContener currentData = getItem(position);

        TextView tv1 = (TextView) listItemView.findViewById(R.id.list_item_title);
        tv1.setText(currentData.getTitle());

        TextView tv2 = (TextView) listItemView.findViewById(R.id.list_item_small_text);
        tv2.setText(currentData.getSmallText());

        ImageView im1 = (ImageView) listItemView.findViewById(R.id.list_item_image);
        im1.setImageResource(currentData.getImageID());


        String fragmentName = currentData.getFragmentName();
        String title = currentData.getTitle();
        String longText = currentData.getLongText();
        int imageID = currentData.getImageID();

        final Intent i = new Intent(context, DetailActivity.class);

        i.putExtra("fragmentName", fragmentName);
        i.putExtra("title", title);
        i.putExtra("longText", longText);
        i.putExtra("imageID", imageID);

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(i);
            }
        });

        return listItemView;
    }

}