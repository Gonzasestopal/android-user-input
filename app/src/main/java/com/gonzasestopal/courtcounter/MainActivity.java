package com.gonzasestopal.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA;

    // Tracks the score for Team B
    int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    private void displayForTeamA(int score) {
        TextView display = (TextView) findViewById(R.id.team_a_score);
        display.setText(score + "");
    }

    private void displayForTeamB(int score) {
        TextView display = (TextView) findViewById(R.id.team_b_score);
        display.setText(score + "");
    }

    public void threePoints(View view) {
        switch (view.getId()) {
            case R.id.threePointsA:
                scoreTeamA = scoreTeamA + 3;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.threePointsB:
                scoreTeamB = scoreTeamB + 3;
                displayForTeamB(scoreTeamB);
                break;
        }
    }

    public void twoPoints(View view) {
        switch (view.getId()) {
            case R.id.twoPointsA:
                scoreTeamA = scoreTeamA + 2;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.twoPointsB:
                scoreTeamB = scoreTeamB + 2;
                displayForTeamB(scoreTeamB);
                break;
        }
    }

    public void onePoints(View view) {
        switch (view.getId()) {
            case R.id.onePointA:
                scoreTeamA = scoreTeamA + 1;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.onePointB:
                scoreTeamB = scoreTeamB + 1;
                displayForTeamB(scoreTeamB);
                break;
        }
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
