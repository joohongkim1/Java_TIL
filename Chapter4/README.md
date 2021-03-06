### Chapter 4. 추상 클래스



#### 1. 추상 클래스란?

1) 추상 클래스

- 추상 메서드를 포함한 클래스
- 추상 메서드 : 구현 코드가 없이 선언부만 있는 메서드
- abstract 예약어 사용
- 추상 클래스는 new (인스턴스화) 할 수 없음
- 구현해야할 클래스를 상위 클래스에 선언한 후 , 구현의 책임을 하위 클래스에 위임한다.



2) 추상 클래스 구현

- 메서드와 클래스에 abstract 키워드 사용
- 추상 메서드가 포함된 클래스는 추상 클래스로 선언
- 모든 메서드가 구현되었다고 해도 클래스에 abstract 키워드를 사용하면 추상 클래스 -> 상속용으로만 사용하는 경우



#### 2. 추상 클래스 응용 - 템플릿 메서드

1) 템플릿 메서드

- 추상 메서드나 구현된 메서드를 활용하여 전체의 흐름을 정의한 메서드
- final 로 선언하여 재정의 할 수 없게 함(기본 틀이 되는 메서드들)

2) 템플릿 메서드 패턴

- 디자인 패턴의 일종
- 프레임워크에서 많이 사용되는 설계 패턴
- 추상 클래스로 선언된 상위 클래스에서 추상 메서드를 이용하여 전체 구현의 흐름을 정의하고, 구체적인 각 메서드 구현은 하위 클래스에 위임

3) final 예약어

- final 변수는 값이 변경될 수 없는 상수

- 오직 한 번만 값을 할당

- 하위 클래스에서 재정의 불가능

- final 클래스는 더 이상 상속되지 않음. (ex) Java의 String 클래스

- 프로젝트 구현 시 여러 파일에서 공유해야 하는 상수 값은 하나의 파일에 선언하여 사용하면 편리

  ```java
  public class Define{
      public static final int MIN = 1;
      public static final int MAX = 9999;
  }
  
  public class UsingDefine {
      public static void main(String[] args) {
          // static 변수이기 때문에 인스턴스가 아닌 클래스명으로 접근가능
          System.out.println(Define.Max)
      }
  }
  ```

  

#### 

