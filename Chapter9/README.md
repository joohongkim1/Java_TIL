## Chapter 9. 예외 처리



### 1. 예외와 예외 처리

#### 1) 오류란 무엇인가 ?

- 컴파일 오류 : 프로그램 코드 작성 중 발생하는 문법적 오류
- 실행 오류 : 실행 중인 프로그램이 의도 하지 않은 동작을 하거나(bug) 프로그램이 중지되는 오류(runtime error)
- 자바는 예외 처리를 통하여 프로그램의 비정상 종료를 막고 log 를 남길 수 있음

#### 2) 오류와 예외 클래스

- 시스템 오류 (error) : 가상 머신에서 발생, 프로그래머가 처리 불가, 동적 메모리를 다 사용한 경우, stack over flow 등
- 예외 : 프로그램에서 제어 할 수 있는 오류, 읽으려는 파일이 없는 경우, 네트웍이나 소켓 연결 오류 등
- 모든 예외 클래스의 최상위 클래스는 Exception 클래스

#### 3) try - with -resources 문

- 리소스를 자동으로 해제하도록 제공해주는 구문
- 해당 리소스가 AutoCloseable 을 구현한 경우 close() 를 명시적으로 호출하지 않아도 try{} 블록에서 오픈된 리소스는 정상적인 경우나 예외가 발생한 경우 모두 자동으로 close() 가 호출됨
- FileInputStream 의 경우 AutoCloseable 을 구현하고 있음

#### 4) 향상된 try - with - resources 문

- 자바 9에서 제공되는 구문

- 자바 9 이전

  ```java
  AutoCloseObj obj = new AutoCloseObj();
  try(AutoCloseObj obj2 = obj){...} // 다른 참조 변수로 다시 선언해야 함
  ```

- 자바  9 이후

  ```java
  AutoCloseObj obj = new AutoCloseObj();
  try(obj){...}
  ```

  

