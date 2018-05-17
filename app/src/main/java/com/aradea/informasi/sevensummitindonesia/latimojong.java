package com.aradea.informasi.sevensummitindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class latimojong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latimojong);

        Button button23 = (Button)findViewById(R.id.button23);

        button23.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(getApplicationContext(), faktalatimojong.class);

                startActivity(i);
            }
        });

        Button button24 = (Button)findViewById(R.id.button24);

        button24.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(getApplicationContext(), jalurlatimojong.class);

                startActivity(i);
            }
        });

        Button button25 = (Button)findViewById(R.id.button25);

        button25.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(getApplicationContext(), petalatimojong.class);

                startActivity(i);
            }
        });
    }
}
