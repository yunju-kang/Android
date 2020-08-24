package com.example.caulculation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //전역변수 선언
    EditText edit1, edit2;
    Button add, sub, mul, div;
    TextView textResult;

    String num1, num2;
    Integer result;

    Button[] numButtons = new Button[10];
    Integer[] numBtnIDs = {R.id.num0, R.id.num1, R.id.num2, R.id.num3, R.id.num4, R.id.num5, R.id.num6, R.id.num7, R.id.num8, R.id.num9 };
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        //아이디 연결
        edit1 = (EditText)findViewById(R.id.Edit1);
        edit2 = (EditText)findViewById(R.id.Edit2);
        add = (Button)findViewById(R.id.Add);
        sub = (Button)findViewById(R.id.Sub);
        mul = (Button)findViewById(R.id.Mul);
        div = (Button)findViewById(R.id.Div);
        textResult = (TextView)findViewById(R.id.Result);

        for(i = 0 ; i < numBtnIDs.length ; i++){
            numButtons[i] = (Button)findViewById(numBtnIDs[i]);
        }






        //숫자 버튼 이벤트
        for(i = 0 ; i <numBtnIDs.length ; i++) {
            //인덱스 생성
            final int index;
            index = i;


            //클릭 이벤트 선언
            numButtons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    //숫자 1 : 기존 입력된 문자열 + 버튼 숫자
                    if (edit1.isFocused() == true) {
                        num1 = edit1.getText().toString() + numButtons[index].getText().toString();
                        edit1.setText(num1);
                    }


                    //숫자 2 : 기존 입력된 문자열 + 버튼 숫자
                    else if(edit2.isFocused() == true) {
                        num2 = edit2.getText().toString() + numButtons[index].getText().toString();
                        edit2.setText(num2);
                    }


                    //숫자1도 2도 아닌 경우
                    else{
                        Toast.makeText(getApplicationContext(), "먼저 '숫자 1' 혹은 '숫자 2'를 클릭하시오", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }








        //연산 버튼 이벤트


            //더하기
        add.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {


                //숫자 문자열로 저장
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();


                //숫자 연산(정수형으로 전환)
                result = Integer.parseInt(num1) + Integer.parseInt(num2);


                //결과 출력(문자열로 전환)
                textResult.setText("계산결과:" + result.toString());


                return false;
            }
        });


            //빼기
        sub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {


                //숫자 문자열로 저장
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();


                //숫자 연산(정수형으로 전환)
                result = Integer.parseInt(num1) - Integer.parseInt(num2);


                //결과 출력(문자열로 전환)
                textResult.setText("계산결과:" + result.toString());


                return false;
            }
        });



            //곱하기
        mul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {


                //숫자 문자열로 저장
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();


                //숫자 연산(정수형으로 전환)
                result = Integer.parseInt(num1) * Integer.parseInt(num2);


                //결과 출력(문자열로 전환)
                textResult.setText("계산결과:" + result.toString());


                return false;
            }
        });



            //나누기
        div.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {


                //숫자 문자열로 저장
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();



                //만약 숫자2가 0이면
                if(num2.equals("0")) {
                    Toast.makeText(getApplicationContext(),"0으로 나눌 수 없습니다", Toast.LENGTH_SHORT).show();
                }
                else {
                    //숫자 연산(정수형으로 전환)
                    result = Integer.parseInt(num1) / Integer.parseInt(num2);


                    //결과 출력(문자열로 전환)
                    textResult.setText("계산결과:" + result.toString());
                }

                return false;
            }
        });






    }
}