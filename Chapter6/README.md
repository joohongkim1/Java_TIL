## Chapter 6. 자바 기본 클래스



#### 1. Object 클래스

- 모든 클래스의 최상위 클래스

- `java.lang.Object` 클래스

- 모든 클래스는 Object 클래스에서 상속 받음

- 모든 클래스는 Object 클래스의 메서드를 사용할 수 있음

- 모든 클래스는 Object 클래스의 일부 메서드를 재정의 하여 사용할 수 있음

  (final 로 정의된 메서드들은 하위 클래스에서 재정의가 불가능하다.)



#### 2. toString() 메서드

- toString() 메서드의 원형

  ```java
  getClass().getName() + '@' + Integer.toHexString(hashCode())
  ```

- 객체의 정보를 String 으로 바꾸어 사용할 때 유용

- 자바 클래스중에는 이미 정의된 클래스가 많음.  String, Integer, Calender 등 많은 클래스에서 재정의하여 사용한다.




#### 3. equals() 메서드

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



#### 4. hashCode() 메서드

- 메서드의 반환 값 : 인스턴스가 저장된 가상머신의 주소를 10진수로 반환

- 두 개의 서로 다른 메모리에 위치한 인스턴스가 동일하다는 것은?

  -> 논리적으로 동일 : equals() 의 반환값이 true

  -> 동일한 hashCode 값을 가짐 : hashCode() 의 반환값이 동일

- 일반적으로 equals() 를 오버라이딩하면 hashcode 도 같이 오버라이딩을 함.