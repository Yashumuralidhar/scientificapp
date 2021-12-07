package com.example.mobileapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    Button b2;
    Button b1;
    TextView text1;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        text1 =(TextView) findViewById(R.id.text1);
        et=(EditText) findViewById(R.id.et);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num=et.getText().toString();
                long n=Long.parseLong(num);
                long f=1;
                et.setText("");
                for(long i=1;i<=n;i++)
                {
                    f=f*i;
                }
                String str = String.valueOf(f);
                text1.setText(str);
            }
        });
    }
}