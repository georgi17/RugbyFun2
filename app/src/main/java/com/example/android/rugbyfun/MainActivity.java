package com.example.android.rugbyfun;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreRCMGalati = 0;
    int scoreCSSSteaua = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamRCMGalati(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_RCMG_score);
        scoreView.setText(String.valueOf(score));

    }

    public void displayForTeamCSSSteaua(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_CSSSteaua_score);
        scoreView.setText(String.valueOf(score));

    }


    public void addExtraTwoForTeamRCMGalati(View v) {
        scoreRCMGalati = scoreRCMGalati + 2;
        displayForTeamRCMGalati(scoreRCMGalati);
    }


    public void addFiveForTeamRCMGalati(View v) {
        scoreRCMGalati = scoreRCMGalati + 5;
        displayForTeamRCMGalati(scoreRCMGalati);
    }


    public void addThreeForTeamRCMGalati(View v) {
        scoreRCMGalati = scoreRCMGalati + 3;
        displayForTeamRCMGalati(scoreRCMGalati);
    }


    public void addExtraTwoForTeamCSSSteaua(View v) {
        scoreCSSSteaua = scoreCSSSteaua + 2;
        displayForTeamCSSSteaua(scoreCSSSteaua);
    }


    public void addFiveForTeamCSSSteaua(View v) {
        scoreCSSSteaua = scoreCSSSteaua + 2;
        displayForTeamCSSSteaua(scoreCSSSteaua);
    }


    public void addThreeForTeamCSSSteaua(View v) {
        scoreCSSSteaua = scoreCSSSteaua + 3;
        displayForTeamCSSSteaua(scoreCSSSteaua);
    }

    public void resetScore(View v) {
        scoreRCMGalati = 0;
        scoreCSSSteaua = 0;
        displayForTeamRCMGalati(scoreRCMGalati);
        displayForTeamCSSSteaua(scoreCSSSteaua);
    }
}
