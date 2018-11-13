package com.example.a805_11.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Edit01, Edit02;
    Button BtnAdd, BtnSub, BtnMul, BtnDiv;
    TextView result;
    String num1, num2;
    Integer res;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Edit01 = findViewById(R.id.Edit01);
        Edit02 = findViewById(R.id.Edit02);

        BtnAdd = findViewById(R.id.BtnAdd);
        BtnSub = findViewById(R.id.BtnSub);
        BtnMul = findViewById(R.id.BtnMul);
        BtnDiv = findViewById(R.id.BtnDiv);

        result = findViewById(R.id.result);

        BtnAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = Edit01.getText().toString();
                num2 = Edit02.getText().toString();
                res = Integer.parseInt(num1) + Integer.parseInt(num2);
                result.setText("계산 결과 : " + res.toString());

                return false;
            }
        });

        BtnSub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = Edit01.getText().toString();
                num2 = Edit02.getText().toString();
                res = Integer.parseInt(num1) - Integer.parseInt(num2);
                result.setText("계산 결과 : " + res.toString());

                return false;
            }
        });

        BtnMul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = Edit01.getText().toString();
                num2 = Edit02.getText().toString();
                res = Integer.parseInt(num1) * Integer.parseInt(num2);
                result.setText("계산 결과 : " + res.toString());

                return false;
            }
        });

        BtnDiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = Edit01.getText().toString();
                num2 = Edit02.getText().toString();
                res = Integer.parseInt(num1) / Integer.parseInt(num2);
                result.setText("계산 결과 : " + res.toString());

                return false;
            }
        });
    }
}
