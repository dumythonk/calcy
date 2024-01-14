package com.example.calcy1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2,t3;
    Button b1,b2,b3,b4;
    Double no1,no2,no3;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.txtno1);
        t2=findViewById(R.id.txtno2);
        t3=findViewById(R.id.txtno3);

        b1=findViewById(R.id.btnAdd);
        b2=findViewById(R.id.btnSub);
        b3=findViewById(R.id.btnMul);
        b4=findViewById(R.id.btnDiv);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no1=Double.parseDouble(t1.getText().toString());
                no2=Double.parseDouble(t2.getText().toString());
                no3=no1+no2;
                t3.setText(String.valueOf(no3));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no1=Double.parseDouble(t1.getText().toString());
                no2=Double.parseDouble(t2.getText().toString());
                no3=no1-no2;
                t3.setText(String.valueOf(no3));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no1=Double.parseDouble(t1.getText().toString());
                no2=Double.parseDouble(t2.getText().toString());
                no3=no1*no2;
                t3.setText(String.valueOf(no3));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no1=Double.parseDouble(t1.getText().toString());
                no2=Double.parseDouble(t2.getText().toString());
                no3=no1/no2;
                t3.setText(String.valueOf(no3));
            }
        });

    }
}
