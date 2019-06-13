package com.example.dicce;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbtn = (Button) findViewById(R.id.rollbutton);

        final ImageView leftDice = findViewById(R.id.leftDice);

        final ImageView rightDice = findViewById(R.id.rightDice);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };

        rollbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("dice", "press the btn");

                Random randomNumber = new Random();
                int randomNum = randomNumber.nextInt(6);

                leftDice.setImageResource(diceArray[randomNum]);

                randomNum = randomNumber.nextInt(6);
                rightDice.setImageResource(diceArray[randomNum]);

            }
        });
    }
}
