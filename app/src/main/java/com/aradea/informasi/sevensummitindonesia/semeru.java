package com.aradea.informasi.sevensummitindonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class semeru extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semeru);

        Button button25 = (Button)findViewById(R.id.button25);

        button25.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(getApplicationContext(), faktasemeru.class);

                startActivity(i);
            }
        });

        Button button26 = (Button)findViewById(R.id.button26);

        button26.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(getApplicationContext(), jalursemeru.class);

                startActivity(i);
            }
        });

        Button button27 = (Button)findViewById(R.id.button27);

        button27.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(getApplicationContext(), petasemeru.class);

                startActivity(i);
            }
        });
    }
}
