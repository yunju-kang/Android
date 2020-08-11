package com.example.baseapp;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //멤버변수
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;


    //기본

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeView();

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

    }


    //초기화
    public void initializeView() {

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
    }


    //OnClickListener

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                //메세지 출력
                Toast.makeText(getApplicationContext(), "네이트를 열었습니다", Toast.LENGTH_SHORT).show();
                //네이트 url 열기
                Intent openNate = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.nate.com"));
                startActivity(openNate);
                break;
            case R.id.button2:
                //메세지 출력
                Toast.makeText(getApplicationContext(), "119에 연락합니다", Toast.LENGTH_SHORT).show();
                //전화 걸기
                Intent call911 = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:/911"));
                startActivity(call911);
                break;
            case R.id.button3:
                //메세지 출력
                Toast.makeText(getApplicationContext(), "갤러리를 엽니다", Toast.LENGTH_SHORT).show();
                //갤러리 열기
                Intent openGallery = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(openGallery);
                break;
            case R.id.button4:
                //메세지 출력
                Toast.makeText(getApplicationContext(), "종료합니다", Toast.LENGTH_SHORT).show();
                //어플리케이션 종료
                finish();
                break;
        }
    }

}
