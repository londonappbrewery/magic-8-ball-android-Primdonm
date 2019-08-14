package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] options=  {
          R.drawable.ball1,
          R.drawable.ball2,
          R.drawable.ball3,
          R.drawable.ball4,
          R.drawable.ball5
        };

       final ImageView ball=findViewById(R.id.magicBall);

        Button roll =findViewById(R.id.rollButton);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random random=new Random();

                int number= random.nextInt(5);

                ball.setImageResource(options[number]);

            }
        });



    }
}
