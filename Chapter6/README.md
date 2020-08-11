## Chapter 6. 자바 기본 클래스



### 1. Object 클래스

- 모든 클래스의 최상위 클래스

- `java.lang.Object` 클래스

- 모든 클래스는 Object 클래스에서 상속 받음

- 모든 클래스는 Object 클래스의 메서드를 사용할 수 있음

- 모든 클래스는 Object 클래스의 일부 메서드를 재정의 하여 사용할 수 있음

  (final 로 정의된 메서드들은 하위 클래스에서 재정의가 불가능하다.)



#### 1) toString() 메서드

- toString() 메서드의 원형

  ```java
  getClass().getName() + '@' + Integer.toHexString(hashCode())
  ```

- 객체의 정보를 String 으로 바꾸어 사용할 때 유용

- 자바 클래스중에는 이미 정의된 클래스가 많음.  String, Integer, Calender 등 많은 클래스에서 재정의하여 사용한다.




#### 2) equals() 메서드

- 두 객체의 동일함을 논리적으로 재정의 할 수 있음
- 물리적 동일함 : 같은 주소를 가지는 객체
- 논리적 동일함 : 같은 학번의 학생, 같은 주문 번호의 주문
- 물리적으로 다른 메모리에 위치한 객체라도 논리적으로 동일함을 구현하기 위해 사용한다.

```java
Student studentLee = new Student(100, "이상원");
Student studentLee2 = studentLee;
Student studentSang = new Student(100, "이상원");
```



![image-20200808182245632](C:\Users\wnghd\AppData\Roaming\Typora\typora-user-images\image-20200808182245632.png)

-> 물리적으로 다른 위치에 있지만, 논리적으로 같은 학생임을 구현해야 함.



#### 3) hashCode() 메서드

- 메서드의 반환 값 : 인스턴스가 저장된 가상머신의 주소를 10진수로 반환

- 두 개의 서로 다른 메모리에 위치한 인스턴스가 동일하다는 것은?

  -> 논리적으로 동일 : equals() 의 반환값이 true

  -> 동일한 hashCode 값을 가짐 : hashCode() 의 반환값이 동일

- 일반적으로 equals() 를 오버라이딩하면 hashcode 도 같이 오버라이딩을 함.



#### 4) Clone() 메서드

- 객체의 복사본을 만듦
- 기본 틀(prototype)으로 부터 같은 속성 값을 가진 객체의 복사본을 생성
- 객체지향 프로그램의 정보은닉에 위배되는 가능성이 있으므로 복제할 객체는 cloneable 인터페이스를 명시해야 함.



### 2. Class 클래스

- 자바의 모든 클래스와 인터페이스는 class 파일로 생성됨

- class 파일에는 객체의 정보(멤버 변수, 메서드, 생성자) 가 포함되어 있음

- Class 클래스는 컴파일된 class 파일에서 객체의 정보를 가져올 수 있음

- 일반적으로 동적 로딩할 때 많이 쓰임

  

#### 1) Class 클래스 가져오기

```java
String s = new String();
class c = s.getClass(); // getClass -> Object 클래스

Class c = String.Class;

Class c = Class.forName("java.lang.String"); // 동적 로딩, 런타임 때 바인딩이 된다.
```



#### 2) reflection 프로그래밍

- Class 클래스로부터 객체의 정보를 가져와 프로그래밍 하는 방식
- 로컬에 객체가 없고 자료형을 알 수 없는 경우 유용한 프로그래밍
- `java.lang.reflect` 패키지에 있는 클래스 활용



#### 3) forName() 메서드와 동적 로딩

- 동적 로딩 : 컴파일 시에 데이터 타입이 모두 binding 되어 자료형이 로딩되는 것, `static loading` 이 아니라 실행 중에 데이터 타입을 알고 binding 되는 방식
- 실행 시에 로딩되므로 경우에 따라 다른 클래스가 사용될 수 있어 유용함
- 컴파일 타임에 체크 할 수 없으므로 해당 문자열에 대한 클래스가 없는 경우 예외 발생 가능