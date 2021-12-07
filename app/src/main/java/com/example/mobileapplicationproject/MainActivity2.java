package com.example.mobileapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class MainActivity2 extends AppCompatActivity {
    Button b2;
    Button b1;
    TextView text1;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b2=findViewById(R.id.b2);
        text1 =(TextView) findViewById(R.id.text1);
        et=(EditText) findViewById(R.id.et);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num=et.getText().toString();
                long n=Long.parseLong(num);
                int f=0;
                et.setText("");
                if (n==1){
                    text1.setText("1\nNot Prime");
                }
                else if(n==2)
                {
                    text1.setText("2\n Prime");
                }
                else
                {
                    for(long i=2;i<=sqrt(n);i++) {

                        if (n % i == 0) {
                            f = 1;
                            break;
                        }
                    }
                    if(f==1)
                    {
                        text1.setText(n+"\nNot Prime");
                    }
                    else if (f==0){
                        text1.setText(n+"\nPrime Number");
                    }
                }



            }
        });
    }
}