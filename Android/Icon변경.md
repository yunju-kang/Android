# Icon변경

## 이미지 수정

- ##### 원하는 이미지 구하기

- ##### 이미지 조정하기

  - Project -> New -> Image Asset
  - Path를 지정하여 이미지 가져오기
  - Resize로 확대률 조절
  - Background Layer -> Color에서 배경색상 지정

- ##### 이미지 저장하기



## 아이콘 적용

- ##### 파일 열기

  project tree에서 mainfests -> AndroidManifest.xml 열기

- ##### 코드 입력

  android : icon과 android : roundIcon 코드를 수정하기

  (@mipmap/ 파일명)

  ```java
  <application
  	android:icon="@mipmap/ic_example"
  	android:roundIcon="@mipmap/ic_example_round"
  ```

