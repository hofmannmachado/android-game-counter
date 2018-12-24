package com.example.android.praticeset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks the score and fault for Team A
    int scoreTeamA = 0;
    int faultTeamA = 0;

    // Tracks the score and fault for Team B
    int scoreTeamB = 0;
    int faultTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addGoalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayGoalForTeamA(scoreTeamA);
    }

    public void addFaultForTeamA(View v) {
        faultTeamA = faultTeamA + 1;
        displayFaultForTeamA(faultTeamA);
    }

    public void addGoalForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayGoalForTeamB(scoreTeamB);
    }

    public void addFaultForTeamB(View v) {
        faultTeamB = faultTeamB + 1;
        displayFaultForTeamB(faultTeamB);
    }

    public void resetScore(View v) {
        scoreTeamA = 0;
        faultTeamA = 0;
        scoreTeamB = 0;
        faultTeamB = 0;
        displayGoalForTeamA(scoreTeamA);
        displayFaultForTeamA(faultTeamA);
        displayGoalForTeamB(scoreTeamA);
        displayFaultForTeamB(faultTeamB);
    }

    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFaultForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fault);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFaultForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fault);
        scoreView.setText(String.valueOf(score));
    }
}