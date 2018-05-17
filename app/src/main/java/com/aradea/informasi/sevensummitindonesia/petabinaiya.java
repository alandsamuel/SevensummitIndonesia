package com.aradea.informasi.sevensummitindonesia;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class petabinaiya extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petabinaiya);

        imageView = (ImageView)findViewById(R.id.petabinaiya);

        PhotoViewAttacher photoView = new PhotoViewAttacher(imageView);
        photoView.update();
    }
}
