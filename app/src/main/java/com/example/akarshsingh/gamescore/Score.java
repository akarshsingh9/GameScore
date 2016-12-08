package com.example.akarshsingh.gamescore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);


    }

    int scoreForTeamA = 0;

    public void displayForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.score);
        scoreView.setText(String.valueOf(score));
    }
    public void plus2(View view)
    {
        scoreForTeamA = scoreForTeamA + 2;
        displayForTeamA(scoreForTeamA);
    }
    public void plus3(View view)
    {
        scoreForTeamA = scoreForTeamA +3;
        displayForTeamA(scoreForTeamA);
    }
    public void plus1(View view)
    {
        scoreForTeamA = scoreForTeamA + 1;
        displayForTeamA(scoreForTeamA);
    }


    public void plus4(View view)
    {
        scoreForTeamA = scoreForTeamA +4;
        displayForTeamA(scoreForTeamA);
    }

    public void plus6(View view)
    {
        scoreForTeamA = scoreForTeamA +6;
        displayForTeamA(scoreForTeamA);
    }

    int scoreForTeamB = 0;

    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(score));
    }
    public void plus2B(View view)
    {
        scoreForTeamB = scoreForTeamB + 2;
        displayForTeamB(scoreForTeamB);
    }
    public void plus3B(View view)
    {
        scoreForTeamB = scoreForTeamB +3;
        displayForTeamB(scoreForTeamB);
    }
    public void plus1B(View view)
    {
        scoreForTeamB = scoreForTeamB + 1;
        displayForTeamB(scoreForTeamB);
    }

    public void plus4B(View view)
    {
        scoreForTeamB = scoreForTeamB + 4;
        displayForTeamB(scoreForTeamB);
    }

    public void plus6B(View view)
    {
        scoreForTeamB = scoreForTeamB + 6;
        displayForTeamB(scoreForTeamB);
    }


    public void resetFuncion(View view)
    {
        scoreForTeamA = 0;
        scoreForTeamB = 0;
        displayForTeamB(scoreForTeamB);
        displayForTeamA(scoreForTeamA);
    }

}
