package com.example.rubiksmarttrainer;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HowToSolvePage extends AppCompatActivity {

    private Button two;
    private Button three;
    private Button four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_solve_page);

        two = findViewById(R.id.twoBtn);
        three = findViewById(R.id.threeBtn);
        four = findViewById(R.id.fourBtn);

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twoPage = new Intent(getApplicationContext(),
                        TwoPage.class);
                startActivity(twoPage);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent threePage = new Intent(getApplicationContext(),
                        ThreePage.class);
                startActivity(threePage);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fourPage = new Intent(getApplicationContext(),
                        FourPage.class);
                startActivity(fourPage);
            }
        });
    }
}
