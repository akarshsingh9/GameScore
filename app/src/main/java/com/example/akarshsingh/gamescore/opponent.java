package com.example.akarshsingh.gamescore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class opponent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opponent);

        final TextView ind = (TextView) findViewById(R.id.ind);
        final TextView pak = (TextView) findViewById(R.id.pak);
        final TextView ausi = (TextView) findViewById(R.id.ausi);
        final TextView sl = (TextView) findViewById(R.id.sl);
        final TextView nz = (TextView) findViewById(R.id.nz);




        pak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(opponent.this, "Your Opponent Pakistan",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(opponent.this,Score.class);

                startActivity(intent);
            }
        });

        ind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(opponent.this, "Your Opponent India",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(opponent.this,Score.class);

                startActivity(intent);
            }
        });

        nz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(opponent.this, "Your Opponent New Zealand",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(opponent.this,Score.class);

                startActivity(intent);
            }
        });

        ausi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(opponent.this, "Your Opponent Australia",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(opponent.this,Score.class);

                startActivity(intent);
            }
        });

        sl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(opponent.this, "Your Opponent Srilanka",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(opponent.this,Score.class);

                startActivity(intent);
            }
        });


    }
}
