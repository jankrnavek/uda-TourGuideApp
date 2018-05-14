package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail);

        Bundle bundle = getIntent().getExtras();

        String fragmentName = bundle.getString("fragmentName");
        String title = bundle.getString("title");
        String longText = bundle.getString("longText");
        int imageID = bundle.getInt("imageID");

        this.setTitle(fragmentName);

        TextView namePlaceView = findViewById(R.id.detail_title);
        namePlaceView.setText(title);

        TextView infoPlaceView = findViewById(R.id.detail_long_text);
        infoPlaceView.setText(longText);

        ImageView imagePlaceView = findViewById(R.id.detail_image);
        imagePlaceView.setImageResource(imageID);

    }
}