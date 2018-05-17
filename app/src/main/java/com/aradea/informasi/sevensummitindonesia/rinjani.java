package com.aradea.informasi.sevensummitindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rinjani extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rinjani);

        Button button28 = (Button)findViewById(R.id.button28);

        button28.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(getApplicationContext(), faktarinjani.class);

                startActivity(i);
            }
        });

        Button button29 = (Button)findViewById(R.id.button29);

        button29.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(getApplicationContext(), jalurrinjani.class);

                startActivity(i);
            }
        });

        Button button30 = (Button)findViewById(R.id.button30);

        button30.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(getApplicationContext(), petarinjani.class);

                startActivity(i);
            }
        });
    }
}
