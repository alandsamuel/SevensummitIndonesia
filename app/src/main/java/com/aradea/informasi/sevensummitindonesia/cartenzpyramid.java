package com.aradea.informasi.sevensummitindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cartenzpyramid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartenzpyramid);

        Button button17 = (Button)findViewById(R.id.button17);

        button17.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(getApplicationContext(), faktacartenz.class);

                startActivity(i);
            }
        });

        Button button18 = (Button)findViewById(R.id.button18);

        button18.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(getApplicationContext(), jalurcartenz.class);

                startActivity(i);
            }
        });

        Button button19 = (Button)findViewById(R.id.button19);

        button19.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(getApplicationContext(), petacartenz.class);

                startActivity(i);
            }
        });
    }
}
