package com.aradea.informasi.sevensummitindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gunungbinaiya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gunungbinaiya);

        Button button14 = (Button)findViewById(R.id.button11);

        button14.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(getApplicationContext(), faktabinaiya.class);

                startActivity(i);
            }
        });

        Button button15 = (Button)findViewById(R.id.button12);

        button15.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(getApplicationContext(), jalurbinaiya.class);

                startActivity(i);
            }
        });

        Button button16 = (Button)findViewById(R.id.button13);

        button16.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(getApplicationContext(), petabinaiya.class);

                startActivity(i);
            }
        });
    }
}
