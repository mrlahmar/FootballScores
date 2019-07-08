package com.example.android.footballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int foulTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    * Team A Code
    * This first Method will display Team A score (Goals)
     */

    public void displayTeamAscore(int score){
        TextView goalsTeamA = (TextView) findViewById(R.id.team_a_score);
        goalsTeamA.setText(String.valueOf(score));
    }

    // This Method will display Team A fouls

    public void displayTeamAfouls(int fouls) {
        TextView foulsTeamAview = (TextView) findViewById(R.id.team_a_fouls);
        foulsTeamAview.setText(String.valueOf(fouls));
    }

    // Add a Goal for Team A

    public void addGoalForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayTeamAscore(scoreTeamA);
    }

    // Add a Foul for Team A

    public void addFoulForTeamA(View view) {
        foulTeamA = foulTeamA + 1;
        displayTeamAfouls(foulTeamA);
    }

    /*
    * Team B Code
    * This first Method will display Team B score (Goals)
     */

    public void displayTeamBscore(int score){
        TextView goalsTeamB = (TextView) findViewById(R.id.team_b_score);
        goalsTeamB.setText(String.valueOf(score));
    }

    // This Method will display Team B fouls

    public void displayTeamBfouls(int fouls) {
        TextView foulsTeamBview = (TextView) findViewById(R.id.team_b_fouls);
        foulsTeamBview.setText(String.valueOf(fouls));
    }

    // Add a Goal for Team B

    public void addGoalForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayTeamBscore(scoreTeamB);
    }

    // Add a Foul for Team B

    public void addFoulForTeamB(View view) {
        foulTeamB = foulTeamB + 1;
        displayTeamBfouls(foulTeamB);
    }

    // The Code for the Reset Method

    public void resetScoreFoul(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayTeamAscore(scoreTeamA);
        displayTeamBscore(scoreTeamB);
        displayTeamBfouls(foulTeamB);
        displayTeamAfouls(foulTeamA);
    }
}
