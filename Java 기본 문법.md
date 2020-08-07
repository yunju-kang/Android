# Java 기본 문법



# 

### 변수와 데이터 형식

| 분류     | 데이터형 | 설명                                           |
| -------- | -------- | ---------------------------------------------- |
| 문자형   | char     | 2B를 사용하며 한글 또는 영문 1개 입력          |
|          | String   | 여러 글자의 문자열 입력                        |
| 정수형   | byte     | 1B를 사용하며 -128~+127까지 입력               |
|          | short    | 2B를 사용하며 -32768~+32767까지 입력           |
|          | int      | 4B를 사용하며 약 -27억~+27억까지 입력          |
|          | long     | 8B를 사용하며 상당히 큰 정수까지 입력          |
| 실수형   | float    | 4B를 사용하며 실수 입력                        |
|          | double   | 8B를 사용하며 실수 입력(float보다 높은 정밀도) |
| 불리언형 | boolean  | true 또는 false 입력                           |



float형에 값을 대입할 때는 숫자 뒤에 f를 붙여야 한다.

char형은 '  '로 문자를 묶어 대입하여야 한다.

String형은 "  "로 문자열을 묶어 대입하여야 한다.

```java
public class exam01 {
	public static void main(String args[]) {
		
		//변수 선언
		int var1 = 1;
		float var2 = 1.2f;
		double var3 = 1.23;		
		char var4 = '가';
		String var5 = "가나다라";
		boolean var6 = true;		
		
		//결과값 출력
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		
	}
}
```

```
1
1.2
1.23
가
가나다라
true
```



# 

### 조건문: if문, switch()~case문

#### - if문

: 조건이 true인지 false인지에 따라서 어떤 작업을 수행할지 결정됨

| if 문 구조                                                   |
| :----------------------------------------------------------- |
| if(조건식) {<br/>	조건식이 true일 때 이 부분 실행<br/>} else {<br/>	조건식이 false일 때 이 부분 실행<br/>} |

<코드 예시>

95점 이상이면 장학생으로 합격, 80점 이상이면 합격, 80점 미만이면 불합격인 조건.

if문을 사용하여 점수에 따라 결과값 출력.

```java
public class exam01 {
	public static void main(String args[]) {

        //점수를 int변수로 받기
		int score = 95;
		
		
		//점수가 95점 이상일 때 실행
		if(score >= 95) {
			System.out.println("장학생으로 합격하였습니다.");
		}		
		//점수가 80점 이상, 95점 미만일 때 실행
		else if(score >= 80) {
			System.out.println("합격하였습니다.");
		}		
		//점수가 80점 미만일 때 실행
		else {
			System.out.println("불합격하였습니다.");
		}		
	}
}
```

<결과값>

```
장학생으로 합격하였습니다.
```



#### - switch()~case문

: 여러가지 경우에 따라 어떤 작업을 수행할지 결정됨

| switch()~case문 구조                                         |
| ------------------------------------------------------------ |
| switch(값) {<br/><br/>case 값1 :<br/>	값1이면 이 부분 실행<br/>	break;<br/><br/>case 값2 :<br/>	값2이면 이 부분 실행<br/>	break;<br/><br/>default :<br/>	아무것도 해당하지 않으면 이 부분 실행<br/>	break;<br/>	<br/>} |

<코드예시>

a는 1등급,  b는 2등급, c는 3등급, d는 4등급.

switch()~case문을 사용하며 해당하는 등급을 출력.

```java
public class exam01 {
	public static void main(String args[]) {
		
		//등급을 char변수로 입력하기
		char grade = 'c';
		
		
		switch(grade) {
		//a등급일 경우
		case 'a':
			System.out.println("1등급입니다.");
			break;
		//b등급일 경우
		case 'b':
			System.out.println("2등급입니다.");
			break;
		//c등급일 경우
		case 'c':
			System.out.println("3등급입니다.");
			break;
		//d등급일 경우
		case 'd':
			System.out.println("4등급입니다.");
			break;					
		
		}
	}
}
```

<결과값>

```
3등급입니다.
```



# 

