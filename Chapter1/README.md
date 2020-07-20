### Chapter 1. 클래스와 객체

#### 1. 함수와 메서드

1) 함수 

- 하나의 기능을 수행하는 코드
- 호출하여 사용하고 기능이 수행된 후 값을 반환 할 수 있음
- 여러 곳에서 호출되어 사용될 수 있음 -> 코드의 재사용성
- 기능이 분리되어 있기 때문에 가독성이 좋다.
- 디버깅, 코드 업데이트, 버전업 시에 유용하게 사용가능하다.
- 스택 메모리에 쌓인다. 스택 메모리 : 함수의 호출이 끝나면 자동으로 메모리가 반환된다.
- 지역 변수 : 함수 호출 시 생성이 돼서 호출이 끝나면 사라지는 변수, 멤버 변수와 다름.

2) 메서드

- 객체 기능 구현을 위해 클래스 내부에 구현되는 함수
- 메서드를 구현함으로써 객체의 기능이 구현
- 메서드의 이름은 사용하는 쪽(클라이언트 코드) 에 맞게 명명하는 것이 좋음



#### 2. 인스턴스, 힙 메모리

1) 인스턴스

- 클래스로부터 생성된 객체
- 힙 메모리에 멤버 변수의 크기에 따라 메모리가 생성
- 클래스를 기반으로 new 키워드를 이요하여 여러 개의 인스턴스를 생성



| 용어      | 설명                                        |
| --------- | ------------------------------------------- |
| 객체      | 객체 지향 프로그램의 대상, 생성된 인스턴스  |
| 클래스    | 객체를 프로그래밍하기 위해 코드로 만든 상태 |
| 인스턴스  | 클래스가 메모리에 생성된 상태               |
| 멤버 변수 | 클래스의 속성, 특성                         |
| 메서드    | 멤버 변수를 이용하여 클래스의 기능을 구현   |
| 참조 변수 | 메모리에 생성된 인스턴스를 가리키는 변수    |
| 참조 값   | 생성된 인스턴스의 메모리 주소 값            |



#### 3. 생성자, 생성자 오버로딩

1) 생성자

- 객체 생성 시 new 키워드와 함께 호출(객체 생성 외에는 호출 불가)
- 인스턴스를 초기화하는 코드가 구현(주로 멤버 변수 초기화)
- 반환 값이 없음, 상속되지 않음
- 생성자는 클래스 이름과 동일

2) 기본 생성자

- 하나의 클래스에는 반드시 하나 이상의 생성자가 존재해야 함
- 개발자가 직접 만들지 않으면 컴파일러가 생성자를 만들어줌
- 기본 생성자는 매개 변수와 구현부가 없음
- 클래스에 다른 생성자가 있는 경우 디폴트 생성자는 제공되지 않음

3) 오버로딩

- 생성자의 이름은 같지만, 매개 변수의 타입 및 개수가 다른 것.