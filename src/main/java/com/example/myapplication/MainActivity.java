package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private  Button button2;
    //private TextView textView1;
    private  TextView scale;
    private  TextView result;
    private EditText editText;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        scale=findViewById(R.id.textView2);
        result=findViewById(R.id.textView3);
        editText=findViewById(R.id.editTextNumber);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editText.getText().toString();
                int celsius=Integer.parseInt(s);
                float far=(celsius*(9/5))+32;
                scale.setText("In Fahrenheit");
                result.setText("Temperature (fahrenheit): "+far);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editText.getText().toString();
                int celsius=Integer.parseInt(s);
                double kelvin= celsius+273.15;
                scale.setText("In Kelvin");
                result.setText("Temperature (kelvin): "+kelvin);
            }
        });
    }
}