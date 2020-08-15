# 기본 Text XML

## 속성

- #### text 속성

  텍스트뷰에 나타나는 문자열

  "(문자열)"형식으로 직접 입력하는 방법

  strings.xml파일에 문자열을 저장하여 "@string/(변수명)"로 호출하는 방법

- #### textColor 속성

  글자의 색상 지정

- #### textSize 속성

  글자의 크기 지정

  단위: dp, px, in, mm, sp

- #### typeface 속성

  글꼴 지정

  sans, serif, monospace를 기본으로 사용 가능

  이 외의 글꼴은 font파일에 별도로 지정 후 사용 가능

- #### textStyle 속성

  글자의 스타일 지정

  bold, italic, bold|italic 설정 가능 

- #### SingleLine 속성

  문자열이 길어 줄이 넘어가는 경우, 한줄로 출력하고 문자열 맨 뒤에 '...' 출력

  true와 false로 설정이 가능하며 디폴트 값은 false



## Java 코드로 XML 속성 설정

- #### Java 코드에서 xml 설정

  1. XML에서 <TextView> 설정

```xml
    <TextView
        android:id="@+id/string1"
        android:layout_width="match_parent"
        android:layout_height="44dp"
        //strings.xml에 str1문자열 저장
        android:text="@string/str1" />
```

​		2. Java에서 속성 변경

```java
public class MainActivity extends AppCompatActivity{

    //멤버변수 설정
    TextView str1;

    public void onCreate(Bundle savedInstanceState) {

        //Id로 텍스트xml 가져오기
        str1 = (TextView)findViewById(R.id.string1);
		
        //xml속성 설정
        str1.setText("setText실행");
        str1.setTextSize(20);
        str1.setTextColor(Color.RED);
        str1.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);
        str1.setSingleLine();
    }

```



- #### 자주 이용되는 xml 속성

| XML 속성         | 관련 메소드               | 비고           |
| ---------------- | ------------------------- | -------------- |
| background       | setBackgroundColor()      | View클래스     |
| clickable        | setClickable()            | View클래스     |
| focusable        | setFocusable()            | View클래스     |
| id               | setId()                   | View클래스     |
| longClickable    | setLongClickable()        | View클래스     |
| padding          | setPadding()              | View클래스     |
| rotation         | setRotation()             | View클래스     |
| scale X, scale Y | setScaleX(), setScaleY()  | View클래스     |
| visibility       | setVisibility()           | View클래스     |
| gravity          | setGravity()              | TextView클래스 |
| inputType        | setRawInputType()         | TextView클래스 |
| password         | setTransformationMethod() | TextView클래스 |
| text             | setText()                 | TextView클래스 |
| textColor        | setTextColor()            | TextView클래스 |
| textSize         | setTextSize()             | TextView클래스 |



