package com.example.calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 멤버변수 선언
    EditText number1, number2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView textResult;
    String num1, num2;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //제목 설정
        setTitle("사칙연산 계산기");


        //변수 대입
        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnMul = (Button)findViewById(R.id.btnMul);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        textResult = (TextView)findViewById(R.id.textResult);

        //버튼 이벤트
            //더하기 버튼 이벤트
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();

                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                textResult.setText("계산 결과: " + result);
            }
        });
            //빼기 버튼 이벤트
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();

                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                textResult.setText("계산 결과: " + result);
            }
        });

            //곱하기 버튼 이벤트
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();

                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                textResult.setText("계산 결과: " + result);
            }
        });

            //나누기 버튼 이벤트
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();

                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                textResult.setText("계산 결과: " + result);
            }
        });
    }
}