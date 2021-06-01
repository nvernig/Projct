package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b1 =  (Button) findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(this);
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(this);
        b4 =  (Button) findViewById(R.id.b4);
        b4.setOnClickListener(this);
        b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(this);
        b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(this);
        b7 = (Button) findViewById(R.id.b7);
        b7.setOnClickListener(this);
        b8 = (Button) findViewById(R.id.b8);
        b8.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b1:
                Intent intent1 = new Intent(this, ScrollingActivity2.class);
                startActivity(intent1);
                break;
            case R.id.b2:
                Intent intent2 = new Intent(this, ScrollingActivity3.class);
                startActivity(intent2);
                break;
            case R.id.b3:
                Intent intent3 = new Intent(this, ScrollingActivity4.class);
                startActivity(intent3);
                break;
            case R.id.b4:
                Intent intent4 = new Intent(this, ScrollingActivity5.class);
                startActivity(intent4);
                break;
            case R.id.b5:
                Intent intent5 = new Intent(this, ScrollingActivity6.class);
                startActivity(intent5);
                break;
            case R.id.b6:
                Intent intent6 = new Intent(this, ScrollingActivity7.class);
                startActivity(intent6);
                break;
            case R.id.b7:
                Intent intent7 = new Intent(this, ScrollingActivity8.class);
                startActivity(intent7);
                break;
            case R.id.b8:
                Intent intent8 = new Intent(this, ScrollingActivity9.class);
                startActivity(intent8 );
                break;

        }

    }
}