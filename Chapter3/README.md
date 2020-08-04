### Chapter 3. 상속과 다형성



#### 1. 상속이란?

1) 상속

- 새로운 클래스를 정의 할 때 이미 구현된 클래스를 상속 받아서 속성이나 기능이 확장되는 클래스를 구현

- 상위 클래스 : parent, base, super class

- 하위 클래스 : child, derived, sub class

  ```java
  class B extends A{}
  ```

- 다중 상속 불가능(single inheritance)

- 하위 클래스는 상위 클래스보다 구체적인 개념과 기능을 가짐

2) proteced 예약어

- 외부 클래스에는 private 으로 하위 클래스에서는 public 의 기능을 구현.
- 다른 외부 클래스에서는 사용 불가능하지만 하위 클래스에서는 사용이 가능하다.



|           | 외부 클래스 | 하위 클래스 | 동일 패키지 | 내부 클래스 |
| --------- | ----------- | ----------- | ----------- | ----------- |
| public    | O           | O           | O           | O           |
| protected | X           | O           | O           | O           |
| default   | X           | X           | O           | O           |
| private   | X           | X           | X           | O           |

