package com.aradea.informasi.sevensummitindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bukitraya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukitraya);

        Button button14 = (Button)findViewById(R.id.button14);

        button14.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(getApplicationContext(), faktabukitraya.class);

                startActivity(i);
            }
        });

        Button button15 = (Button)findViewById(R.id.button15);

        button15.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(getApplicationContext(), jalurbukitraya.class);

                startActivity(i);
            }
        });

        Button button16 = (Button)findViewById(R.id.button16);

        button16.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(getApplicationContext(), petabukitraya.class);

                startActivity(i);
            }
        });
    }
}
