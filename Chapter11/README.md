## Chapter 11. 자바 Thread 프로그래밍



### 1. Thread 구현

#### 1) Thread 란?

- Process : 실행중인 프로그램, OS로부터 메모리를 할당 받음
- Thread : 실제 프로그램이 수행되는 작업의 최소 단위, 하나의 프로세스는 하나 이상의 Thread 를 가진다.
- Thread 구현 방법 
  - 자바 Thread 클래스로부터 상속받아 구현
  - Runnable 인터페이스 구현 
    - 자바는 다중 상속이 허용되지 않으므로 이미 다른 클래스를 상속한 경우 thread 를 만들려면 Runnable interface 를 implements 하도록 한다.

#### 2) Multi-thread 프로그래밍

- 동시에 여러 개의 Thread 가 수행되는 프로그래밍
- Thread 는 각각의 작업공간(Context)를 가짐
- 공유 자원이 있는 경우 race condition 발생
- critical section(임계 영역) 에 대한 동기화(synchronization) 구현이 필요 -> 쓰레드 접근 순서를 정하는 과정, 임계 영역에 동시에 1개의 쓰레드만 접근 가능