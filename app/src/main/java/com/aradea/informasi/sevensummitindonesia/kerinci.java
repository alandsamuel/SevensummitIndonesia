package com.aradea.informasi.sevensummitindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kerinci extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerinci);

        Button button20 = (Button)findViewById(R.id.button20);

        button20.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(getApplicationContext(), faktakerinci.class);

                startActivity(i);
            }
        });

        Button button21 = (Button)findViewById(R.id.button21);

        button21.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(getApplicationContext(), jalurkerinci.class);

                startActivity(i);
            }
        });

        Button button22 = (Button)findViewById(R.id.button22);

        button22.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(getApplicationContext(), petakerinci.class);

                startActivity(i);
            }
        });
    }
}
