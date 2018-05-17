package com.aradea.informasi.sevensummitindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class summit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summit);


        Button button51 = (Button) findViewById(R.id.button51);

        button51.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), erik.class);

                startActivity(i);
            }

        });

        Button button61 = (Button) findViewById(R.id.button61);

        button61.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), kansha.class);

                startActivity(i);
            }

        });

        Button button71 = (Button) findViewById(R.id.button71);

        button71.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), meilana.class);

                startActivity(i);
            }

        });

        Button button91 = (Button) findViewById(R.id.button91);

        button91.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), prabowo.class);

                startActivity(i);
            }

        });

        Button button81 = (Button) findViewById(R.id.button81);

        button81.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), rahman.class);

                startActivity(i);
            }

        });
    }
}
