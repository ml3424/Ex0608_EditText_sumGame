package com.example.ex0608_edittext_sumgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tV1, tV2, tV3, tV4, tV5, tV6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tV1 =  findViewById(R.id.tV1);
        tV2 =  findViewById(R.id.tV2);
        tV3 =  findViewById(R.id.tV3);
        tV4 =  findViewById(R.id.tV4);
        tV5 =  findViewById(R.id.tV5);
        tV6 =  findViewById(R.id.tV6);
    }
}