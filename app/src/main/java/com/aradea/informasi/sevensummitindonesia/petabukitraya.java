package com.aradea.informasi.sevensummitindonesia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class petabukitraya extends AppCompatActivity {


    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petabukitraya);

        imageView = (ImageView)findViewById(R.id.petabinaiya);

        PhotoViewAttacher photoView = new PhotoViewAttacher(imageView);
        photoView.update();
    }
}
