## Chapter 11. 자바 Thread 프로그래밍



### 1. Thread 구현

#### 1) Thread 란?

- **Process** : 실행중인 프로그램, OS로부터 메모리를 할당 받음
- **Thread** : 실제 프로그램이 수행되는 작업의 최소 단위, 하나의 프로세스는 하나 이상의 Thread 를 가진다.
- Thread 구현 방법 
  - 자바 **Thread** 클래스로부터 상속받아 구현
  - **Runnable** 인터페이스 구현 
    - 자바는 다중 상속이 허용되지 않으므로 이미 다른 클래스를 상속한 경우 thread 를 만들려면 Runnable interface 를 implements 하도록 한다.

#### 2) Multi-thread 프로그래밍

- 동시에 여러 개의 Thread 가 수행되는 프로그래밍
- Thread 는 각각의 작업공간(Context)를 가짐
- 공유 자원이 있는 경우 race condition 발생
- critical section(임계 영역) 에 대한 동기화(synchronization) 구현이 필요 -> 쓰레드 접근 순서를 정하는 과정, 임계 영역에 동시에 1개의 쓰레드만 접근 가능



### 2. Thread 의 여러가지 메서드 활용

#### 1) Thread status

- 쓰레드가 start 되면 runnable 한 상태가 됨 -> runnable 한 상태에서 CPU 점유 가능, 스케쥴러가 CPU 배분 -> 쓰레드가 종료되면 Dead 상태
- **Not Runnable** 로 빠지는 경우 (CPU 를 점유할 수 없어서 실행될 수 없는 상태)

  - sleep() : Thread 의 static 메소드 -> 시간이 지나면 Runnable 상태로 돌아온다.
  - wait() : notify() 가 호출되면 Runnable 상태가 된다.
  - join() : 한 쓰레드가 다른 쓰레드에 join 을 걸면 다른 쓰레드가 끝날 때까지 join 을 건 쓰레드가 Not Runnable 상태가 된다. -> other 쓰레드가 끝나게 되면 Runnable 상태
- Not Runnable 상태에서 빠져나오지 못하는 경우 InterruptException 예외 처리

#### 2) Thread 우선순위

- Thread.MIN_PRIORITY(=1) ~ Thread.MAX_PRIORITY(=10)
- default 우선 순위 : 5
- 우선 순위가 높은 thread 는 CPU 를 배분 받을 확률이 높음

#### 3)  join() 메서드

- 다른 thread 의 결과를 보고 진행해야 하는 일이 있는 경우 join() 메서드를 활용
- join() 메서드를 호출한 thread 가 Not Runnable 상태가 됨

#### 4) interrupt() 메서드

- 다른 thread 에 예외를 발생시키는 interrupt 를 보냄

- thread 가 join(), sleep(), wait() 메서드에 의해 블럭킹 되었다면 interrupt 에 의해 다시 runnable 상태가 될 수 있음

#### 5) Thread 종료하기

- 데몬 등 무한 반복하는 thread 가 종료될 수 있도록 run() 메서드 내의 while 문을 활용
- Thread.stop() 은 사용하지 않음



### 3. multi-thread 프로그래밍

#### 1) 임계 영역(critical section)

- 두 개 이상의 thread 가 동시에 접근하게 되는 리소스
- critical section 에 동시에 thread 가 접근하게 되면 실행 결과를 보장할 수 없음
- thread 간의 순서를 맞추는 동기화 작업 필요

#### 2) 동기화 (synchronization)

- 임계 영역에 여러 thread 가 접근하는 경우 한 thread 가 수행하는 동안 공유 자원을 **lock** 하여 다른 thread 의 접근을 막음
- 동기화를 잘못 구현하면 deadlock 에 빠질 수 있음 

#### 3) 동기화 구현

- syncronized 수행문과 syncronized 메서드를 이용

  - syncronized 수행문 

    ```java
    syncronized(참조형 수식) {
        
    } // 참조형 수식에 해당되는 객체에 lock 을 건다
    ```

  - syncronized 메서드

    - 현재 이 메서드가 속해 있는 객체에 lock 을 건다.
    - deadlock 방지를 위에 syncronized 메서드 내에서 다른 syncronized 메서드를 호출하지 않는다.

#### 4) wait() / notify()

- wait() : 리소스가 더 이상 유효하지 않은 경우 리소스가 사용 가능할 때까지 thread 를 non-runnable 상태로 전환, notify() 가 호출 될 때까지 기다린다.
- notify() : wait() 하고 있는 thread 중 **한 thread** 를 runnable 한 상태로 만듦
- notifyAll() : wait() 하고 있는 **모든 thread** 가 runnable 한 상태가 되도록 함. 특정 thread 가 통지를 받도록 제어 할 수 없으므로 모두 깨운 후 스케쥴러에 CPU 를 점유하는 것이 조금 더 공평, notifyAll() 사용을 더 권장한다.







