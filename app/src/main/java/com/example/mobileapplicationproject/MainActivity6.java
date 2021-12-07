package com.example.mobileapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    Button b2;
    Button b1;
    TextView text1;
    EditText et;
    EditText et1;
    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        text1 =(TextView) findViewById(R.id.text1);
        et=(EditText) findViewById(R.id.et);
        et2=(EditText) findViewById(R.id.et2);
        et1=(EditText) findViewById(R.id.et1);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity6.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numa=et.getText().toString();
                String numb=et2.getText().toString();
                String num1=et1.getText().toString();
                double a=Double.parseDouble(numa);
                double b=Double.parseDouble(numb);
                double num=((a*12)+b)*0.0254;

                double height=num;
                double weight=Double.parseDouble(num1);
                double bmi = weight/(height*height);

                et.setText("");
                et1.setText("");
                et2.setText("");
                if (bmi < 18.5)
                {
                    text1.setText("Under Weighted");
                }


                else if ( bmi >= 18.5 && bmi < 24.9)
                {
                    text1.setText("Healthy");
                }

                else if ( bmi >= 24.9 && bmi < 30)
                {
                    text1.setText("Over Weighted");
                }


                else if ( bmi >=30)
                {
                    text1.setText("Suffering from Obesity");
                }


            }
        });

        }

}
