package com.example.akarshsingh.gamescore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView india = (TextView) findViewById(R.id.india);
        final TextView pakistan = (TextView) findViewById(R.id.pakistan);
        final TextView australia = (TextView) findViewById(R.id.australia);
        final TextView srilanka = (TextView) findViewById(R.id.srilanka);
        final TextView newzealand = (TextView) findViewById(R.id.newzealand);


       india.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "You are India", Toast.LENGTH_SHORT).show();
               Intent i = new Intent(MainActivity.this,opponent.class);

               startActivity(i);
           }
       });

        pakistan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You are Pakistan", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,opponent.class);

                startActivity(i);
            }
        });

        australia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You are Australia", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,opponent.class);

                startActivity(i);
            }
        });

        srilanka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You are SriLanka", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,opponent.class);

                startActivity(i);
            }
        });

        newzealand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You are New Zealand", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,opponent.class);

                startActivity(i);
            }
        });
    }





}

