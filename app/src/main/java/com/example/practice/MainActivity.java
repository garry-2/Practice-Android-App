package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    LottieAnimationView ticTacToeView;
    AppCompatButton btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ticTacToeView = findViewById(R.id.ticTacToeView);
        ticTacToeView.setAnimation(R.raw.tictactoeanim);
        ticTacToeView.playAnimation();

        btn1 = findViewById(R.id.ticTacToebtn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ticTacToeIntent = new Intent(MainActivity.this,TicTacToe.class);
                startActivity(ticTacToeIntent);

            }
        });
    }
}