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

#### 1. 컬렉션 프레임워크란?

- 프로그램 구현에 필요한 자료구조와 알고리즘을 구현해 놓은 라이브러리
- java.util 패키지에 구현되어 있음
- 개발에 소요되는 시간을 절약하고 최적화된 라이브러리를 사용할 수 있음
- Collection 인터페이스와 Map 인터페이스로 구성됨
  - Collection 인터페이스
    - 하나의 객체의 관리를 위해 선언된 인터페이스로 필요한 기본 메서드가 선언되어 있음
    - 하위에 List, Set 인터페이스가 있음
  - Map 인터페이스
    - 쌍으로 이루어진 객체를 관리하는데 필요한 여러 메서드가 선언되어 있음
    - Map 을 사용하는 객체는 key-value 쌍으로 되어 있고, key 는 중복 불가
    - Hashtable, HashMap, TreeMap 



#### 2. Collection 인터페이스

##### 1) List 인터페이스

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


- Stack 구현

	- LIFO : 맨 마지막에 추가된 요소가 가장 먼저 꺼내지는 자료구조
	- ArrayList 나 LinkedList 로 구현 할 수 있음


- Queue 구현

	- FIFO : 먼저 저장된 자료가 먼저 꺼내지는 자료 구조
	- 선착순, 대기열 등을 구현할 때 가장 많이 사용되는 자료 구조
	- ArrayList 나 LinkedList 로 구현 할 수 있음



##### 2) Set 인터페이스

- 저장된 순서와 출력 순서는 다를 수 있음
- 아이디, 주민번호, 사번 등 유일한 값이나 객체를 관리할 때 사용

- Iterator 로 순회하기

  - Collection 의 개체를 순회하는 인터페이스

  - iterator() 메서드 호출

    ```java
    Iterator it = memberArrayList.iterator();
    ```

  - Iterator 에 선언된 메서드

    - boolean hashNext() : 이후에 요소가 더 있는지를 체크하는 메서드
    - E next() : 다음에 있는 요소를 반환

- TreeSet 클래스

  - 객체의 정렬에 사용되는 클래스
  - 중복을 허용하지 않으면서 오름차순이나 내림차순으로 객체를 정렬 함
  - 내부적으로 이진 검색 트리로 구현되어 있음
  - 이진 검색 트리에 자료가 저장 될 때 비교하여 저장될 위치를 정함
  - 객체 비교를 위해  Comparable 이나 Comparator 인터페이스를 구현 해야 함.

- Comparable 인터페이스와 Comparator 인터페이스

  - 정렬 대상이 되는 클래스가 구현해야 하는 인터페이스
  - Comparble 은 compareTo() 메서드를 구현, 매개 변수와 자기 자신(this) 를 비교
  - Comparator 는 compare() 메서드 구현, 두 개의 매개 변수를 비교
    - TreeSet 생성자에 Comparator 가 구현된 객체를 매개변수로 전달
  - 일반적으로 Comparable 을 더 많이 사용
  - 이미 Comparable 이 구현된 경우 Comparator 를 이용하여 다른 정렬 방식을 정의 할 수 있음



#### 3. Map 인터페이스

- key-value pair 의 객체를 관리하는데 필요한 메서드가 정의 됨
- key 는 중복 될 수 없음
- 검색을 위한 자료 구조
- key 를 이용하여 값을 저장하거나 검색, 삭제 할 때 사용하면 편리
- 내부적으로 hash 방식으로 구현 됨
- key 가 되는 객체는 객체의 유일성 여부를 알기 위해 equals() 와 hashCode() 메서드를 재정의

































