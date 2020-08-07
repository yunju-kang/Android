# Java 기본 문법

[배열](#배열)

 

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
### 배열

- 여러 개의 변수를 나란히 나열한 것

- 선언방법

  - 데이터형[ ] 배열이름 = new 데이터형[개수];

  - 데이터형 배열이름[ ] = new 데이터형[개수];

  - 데이터형[ ] 배열이름;

    배열이름 = new [개수];

  ```java
  int[] example1 = new int[3];
  
  int example2[] = new int[4];
  
  int[] example3;
  example3 = new int[5];
  ```

- 값 대입 방법

  ```java
  //일차원배열	
  int example1[] = new int[3];
  example1[0] = 10;
  example1[2] = 12;
  
  //이차원배열
  int example2[] = new int [2][3];
  example2[0][0] = 100;
  example2[1][2] = 112;
  
  //선언과 동시에 값 대입
  int example3[] = {1,2,3};
  ```

### 

#   

### 반복문: for문, while문

- #### for문

| for 문 형식                                                  |
| ------------------------------------------------------------ |
| for(초기식; 조건식; 증감식) {<br/>	//이 부분을 반복 실행<br/>} |

<코드 예제>

1월부터 12월까지 매달 1000원씩 저금.

for문을 활용하며 저축금액을 출력하기.

```java
public class exam01 {
	public static void main(String args[]) {
		
        //저축된 금액 변수 선언
		int money = 0;
		
        //1월에서 12월이 될 때까지 month 증가하여 반복 실행
		for(int month = 1; month<=12; month++) {
            //매달 저축된 금액을 1000원씩 올리기
			money = money + 1000;
		}
		
        //저축된 금액 출력
		System.out.print(money);
	}
}
```

<결과값>

```
12000
```





| for문 형식 : 배열 사용시                                     |
| ------------------------------------------------------------ |
| for(변수형 변수 : 배열명) {<br/>	//이 부분을 반복 실행<br/>} |

<코드예제>

아빠, 엄마, 누나, 형으로 이루어진 배열을 만들기.

이 배열의 요소들을 for문으로 출력하기.

```java
public class exam01 {
	public static void main(String args[]) {
		
        //가족배열 선언
		String family[] = {"아빠", "엄마", "누나", "형"};
		
        //가족배열에 대해 반복
		for(String i: family) {
            //가족배열 구성요소 출력
			System.out.println(i);
		}
	}
}
```

<결과값>

```
아빠
엄마
누나
형
```



- #### while문

| while문 형식                                                 |
| ------------------------------------------------------------ |
| while(조건식) {<br/>	//조건식이 true일 동안 이 부분 실행<br/>} |

<코드예제>

현재 엄마는 37세, 아들은 12세.

엄마 나이가 아들 나이의 2배가 되는 시점 구하기.

while문을 사용해 2배가 되는 시점, 그때의 엄마 나이, 아들 나이 출력.

```java
public class exam01 {
	public static void main(String args[]) {
		
        //현재 엄마 나이, 현재 아들 나이, 년도 변수 선언
		int mom = 37;
		int son = 12;
		int year = 0;
      
        // 아들나이*2가 엄마나이보다 적다면 while문 실행
		while(son*2 < mom) {
            //엄마나이, 아들나이, 년도 변수 1씩 증가
			mom++;
			son++;	
			year++;			
		}
		
        //결과값 출력
		System.out.printf("[%d년 후]\n 엄마 : %d세 \n 아들 : %d세", year, mom, son);
	}
}
```

<결과값>

```
[13년 후]
 엄마 : 50세 
 아들 : 25세
```




