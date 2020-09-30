package com.example.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    public int AScore = 0;
    public int BScore = 0;
    TextView team_a_score, team_b_score;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Team A
        team_a_score = findViewById(R.id.team_a_score);
        findViewById(R.id.team_a_three).setOnClickListener(v -> on_a_three());
        findViewById(R.id.team_a_five).setOnClickListener(v -> on_a_five());
        findViewById(R.id.team_a_ten).setOnClickListener(v -> on_a_ten());
        // Team B
        team_b_score = findViewById(R.id.team_b_score);
        findViewById(R.id.team_b_three).setOnClickListener(v -> on_b_three());
        findViewById(R.id.team_b_five).setOnClickListener(v -> on_b_five());
        findViewById(R.id.team_b_ten).setOnClickListener(v -> on_b_ten());
        findViewById(R.id.resetBtn).setOnClickListener(v -> onReset());
    }

    public void on_a_three() {
        AScore += 3;
        displayTeamA(AScore);
    }

    public void on_a_five() {
        AScore += 5;
        displayTeamA(AScore);
    }

    public void on_a_ten() {
        AScore += 10;
        displayTeamA(AScore);
    }

    public void on_b_three() {
        BScore += 3;
        displayTeamB(BScore);
    }

    public void on_b_five() {
        BScore += 5;
        displayTeamB(BScore);
    }

    public void on_b_ten() {
        BScore += 10;
        displayTeamB(BScore);
    }

    public void onReset() {
        AScore = BScore = 0;
        displayTeamA(AScore);
        displayTeamB(BScore);
    }

    private void displayTeamA(int aScore) {
        team_a_score.setText(String.valueOf(aScore));
    }

    private void displayTeamB(int bScore) {
        team_b_score.setText(String.valueOf(bScore));
    }

}
