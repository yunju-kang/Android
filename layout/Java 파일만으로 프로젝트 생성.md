# Java 파일만으로 프로젝트 생성

## 프로젝트 내용

레이아웃에 에디트텍스트 1개, 버튼 1개, 텍스트뷰 1개 생성

버튼을 클릭하면 에디트텍스트에 쓰인 문자열이 텍스트뷰에 출력됨



## Java 파일 프로그래밍

#### 1. 글로번 변수 선언

(OnCreate 외부)

```java
public class MainActivity extends AppCompatActivity {

	//버튼 이벤트 출력용 변수
    String str;
    
    //위젯 변수
    EditText edit;
    Button btn;
    TextView text;

```



#### 2. 변수 설정

(OnCreate 내부)

1. 레이아웃 변수 설정

   ```java
      @Override
       protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
   
           //레이아웃 크기 변수
           LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
   		
           //레이아웃 변수 선언
           LinearLayout baseLayout = new LinearLayout(this);
   		
           //정렬 속성 설정
           baseLayout.setOrientation(LinearLayout.VERTICAL);
   
           //레이아웃 화면 출력
           setContentView(baseLayout, params);
   ```

2. 에디트텍스트 변수 설정

   ```java
       	//변수 설정    
   		edit = new EditText(this);
   ```

3. 버튼 변수 설정

   ```java
          //변수 설정
   		btn = new Button(this);
   
   		//버튼 텍스트 설정
           btn.setText("버튼입니다");
   		//버튼 색깔 설정
           btn.setBackgroundColor(Color.MAGENTA);
   ```

4. 텍스트뷰 변수 설정

   ```java
           //변수 설정
   		text = new TextView(this);
   		
   		//텍스트 색깔 설정
           text.setTextColor(Color.CYAN);
   ```



#### 3. 레이아웃에 위젯 추가

(OnCreate 내부)

```java
        //addView에 추가한 순으로 정렬됨
		baseLayout.addView(edit);
        baseLayout.addView(btn);
        baseLayout.addView(text);        
```



#### 4. 버튼 이벤트 설정

(OnCreate 내부)

```java
btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //에디트텍스트에 입력한 문자열 저장
                str = edit.getText().toString();
				
                //텍스트뷰에 문자열 출력
                text.setText(str);
            }
        });
```

