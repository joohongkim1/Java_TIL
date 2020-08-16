## Chapter 7. 컬렉션 프레임워크



### 1. 제네릭 프로그래밍

#### 1) 제네릭 프로그래밍

- 변수의 선언이나 메서드의 매개변수를 하나의 참조 자료형이 아닌 여러 자료형으로 변환 될 수 있도록 프로그래밍 하는 방식

- 실제 사용되는 참조 자료형으로의 변환은 컴파일러가 검증하므로 안정적인 프로그래밍 방식

- 자료형 매개 변수 T

  ```java
  public class GenericPrinter <T> {}  // 제네릭 클래스
  // <T> -> type의 약자, 자료형 매개 변수
  ```

  

#### 2) 제네릭 메서드

- 메서드 내에서의 자료형 매개 변수는 매서드 내에서만 유효(지역 변수와 같은 개념)

  ```java
  class Shape<T>{
      public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2){ // Shape 의 T 와 makeRectangle 의 T 는 전혀 다른 의미
          ...
      }
  }
  ```



### 2. 컬렉션 프레임워크

#### 1) 컬렉션 프레임워크란?

- 프로그램 구현에 필요한 자료구조와 알고리즘을 구현해 놓은 라이브러리

- java.util 패키지에 구현되어 있음

- 개발에 소요되는 시간을 절약하고 최적화된 라이브러리를 사용할 수 있음

- Collection 인터페이스와 Map 인터페이스로 구성됨

  - Collection 인터페이스

    - 하나의 객체의 관리를 위해 선언된 인터페이스로 필요한 기본 메서드가 선언되어 있음
    - 하위에 List, Set 인터페이스가 있음

    ![collection](https://user-images.githubusercontent.com/52685243/90327856-ab66f900-dfd2-11ea-9cbb-b42bb2635fb2.PNG)

  - Map 인터페이스

    - 쌍으로 이루어진 객체를 관리하는데 필요한 여러 메서드가 선언되어 있음
    - Map 을 사용하는 객체는 key-value 쌍으로 되어 있고, key 는 중복 불가
    - Hashtable, HashMap, TreeMap 



#### 2) List 인터페이스

- Collection 하위 인터페이스

- 객체를 순서에 따라 저장하고 관리하는데 필요한 메서드가 선언된 인터페이스

- ArrayList, Vector, LinkedList 

  - ArrayList 와 Vector

    - 객체 배열 클래스

    - 일반적으로 ArrayList 더 많이 사용

    - Vector 는 멀티 쓰레드 프로그램에서 동기화 지원

      cf) 동기화 : 두 개의 쓰레드가 동시에 하나의 리소스에 접근 할 때 순서를 맞추어서 데이터의 오류를 방지

    - capacity : 배열의 크기, size : 배열 안의 element 들의 개수

  - ArrayList 와 LinkedList

    - 둘 다 자료의 순차적 구조를 구현
    - ArrayList 는 배열을 구현, 논리적 순서와 물리적 순서가 동일
    - LinkedList 는 논리적으로 순차적이지만, 물리적으로는 순차적이지 않을 수 있음
    - LinkedList 의 경우 자료의 추가와 삭제에 들어가는 비용이 효율적이다.
    - 배열의 데이터 추가 및 삭제가 많지 않고, i 번째 데이터 검색에는 ArrayList 가 효율적

 

