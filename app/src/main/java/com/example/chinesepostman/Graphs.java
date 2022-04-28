package com.example.chinesepostman;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Graphs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphs);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void showExample1(View view) {
        Intent intent = new Intent(this, Example1.class);
        startActivity(intent);
    }

    public void showExample2(View view) {
        Intent intent = new Intent(this, Example2.class);
        startActivity(intent);
    }
    
}