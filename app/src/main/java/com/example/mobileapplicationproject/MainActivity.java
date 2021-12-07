package com.example.mobileapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });
        b2=findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
                finish();
            }
        });
        b3=findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,MainActivity4.class);
                startActivity(intent);
                finish();
            }
        });
        b4=findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,MainActivity5.class);
                startActivity(intent);
                finish();
            }
        });
        b5=findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,MainActivity6.class);
                startActivity(intent);
                finish();
            }
        });
        b6=findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,MainActivity7.class);
                startActivity(intent);
                finish();
            }
        });
    }
}