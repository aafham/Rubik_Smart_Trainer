package com.example.rubiksmarttrainer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private Button explanation;
    private Button howToSolve;
    private Button tutorial;
    private Button timer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Home Page");

        explanation = findViewById(R.id.explanationBtn);
        howToSolve = findViewById(R.id.howtosolveBtn);
        tutorial = findViewById(R.id.tutorialBtn);
        timer = findViewById(R.id.timerBtn);

        explanation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explanationPage = new Intent(getApplicationContext(),
                        ExplanationPage.class);
                startActivity(explanationPage);
            }
        });

        howToSolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent howToSolvePage = new Intent(getApplicationContext(),
                        HowToSolvePage.class);
                startActivity(howToSolvePage);
            }
        });

        tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tutorialPage = new Intent(getApplicationContext(),
                        TutorialPage.class);
                startActivity(tutorialPage);
            }
        });

        timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent timerPage = new Intent(getApplicationContext(),
                        TimerPage.class);
                startActivity(timerPage);
            }
        });
    }
}
