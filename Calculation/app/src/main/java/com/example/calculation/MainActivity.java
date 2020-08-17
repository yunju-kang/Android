package com.example.calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 멤버변수 선언
    EditText number1, number2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView textResult;
    String num1, num2;
    Float result;

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

                //입력된 값을 문자열로 가져오기
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();

                // 빈칸 존재 시
                if(num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "빈칸이 있습니다", Toast.LENGTH_SHORT).show();
                }

                //더하기 실행
                else {
                    result = Float.parseFloat(num1) + Float.parseFloat(num2);
                    textResult.setText("계산 결과: " + result.toString());
                }

            }
        });



            //빼기 버튼 이벤트
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //입력된 값을 문자열로 가져오기
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();

                // 빈칸 존재 시
                if(num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "빈칸이 있습니다", Toast.LENGTH_SHORT).show();
                }

                //빼기 실행
                else {
                    result = Float.parseFloat(num1) - Float.parseFloat(num2);
                    textResult.setText("계산 결과: " + result.toString());
                }
            }
        });




            //곱하기 버튼 이벤트
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //입력된 값을 문자열로 가져오기
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();

                // 빈칸 존재 시
                if(num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "빈칸이 있습니다", Toast.LENGTH_SHORT).show();
                }

                //곱하기 실행
                else {
                    result = Float.parseFloat(num1) * Float.parseFloat(num2);
                    textResult.setText("계산 결과: " + result.toString());
                }

            }
        });



            //나누기 버튼 이벤트
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //입력된 값을 문자열로 가져오기
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();

                // 빈칸 존재 시
                if(num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "빈칸이 있습니다", Toast.LENGTH_SHORT).show();
                }

                else {

                    //0으로 나누는 경우 오류문 출력
                    if (Float.parseFloat(num2) == 0) {
                        Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다", Toast.LENGTH_SHORT).show();
                    }
                    //나누기 실행
                    else {
                        result = Float.parseFloat(num1) / Float.parseFloat(num2);
                        textResult.setText("계산 결과: " + result.toString());
                    }
                }

               }
            });
        }
    }



