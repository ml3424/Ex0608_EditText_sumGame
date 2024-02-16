package com.example.ex0608_edittext_sumgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tV1, tV2, tV3, tV4, tV5, tV6;
    EditText eT1,eT2,eT3;
    ImageView iV1,iV2,iV3;

    Random rand = new Random();
    int rnd1 = 0, rnd2 = 0;
    String st;
    int answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // text views and set the second and third col to invisible
        tV1 =  findViewById(R.id.tV1);
        tV2 =  findViewById(R.id.tV2);
        tV3 =  findViewById(R.id.tV3);
        tV4 =  findViewById(R.id.tV4);
        tV5 =  findViewById(R.id.tV5);
        tV6 =  findViewById(R.id.tV6);

        tV2.setVisibility(View.INVISIBLE);
        tV3.setVisibility(View.INVISIBLE);
        tV5.setVisibility(View.INVISIBLE);
        tV6.setVisibility(View.INVISIBLE);

        //edit texts
        eT1 = findViewById(R.id.eT1);
        eT2 = findViewById(R.id.eT2);
        eT3 = findViewById(R.id.eT3);

        eT2.setVisibility(View.INVISIBLE);
        eT3.setVisibility(View.INVISIBLE);

        iV1 = findViewById(R.id.iV1);
        iV2 = findViewById(R.id.iV2);
        iV3 = findViewById(R.id.iV3);

        // random numbers
        rnd1 = rand.nextInt(90)+10;
        rnd2 = rand.nextInt(90)+10;

        // The numbers are displayed on the screen.
        tV1.setText(String.valueOf(rnd1));
        tV4.setText(String.valueOf(rnd2));
    }


}