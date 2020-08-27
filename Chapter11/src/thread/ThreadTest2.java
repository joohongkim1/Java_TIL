package thread;

class MyThread2 implements Runnable {
	
	// 쓰레드가 start 되면 run 이라는 메소드가 실행된다.
	public void run() {
		int i;
		
		for( i = 0; i <= 200; i++) {
			System.out.print(i + "\t");
			
			try {
				// Thread 클래스의 static 메소드
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadTest2 {
	
	public static void main(String[] args) {
		
		System.out.println("start");
//		MyThread2 th1 = new MyThread2();
//		MyThread2 th2 = new MyThread2();
		
		// 번갈아가면서 실행된다
		// 가장 먼저 종료되는 쓰레드는 main 쓰레드
		// main 쓰레드 : start 출력 -> Thread 2개 만든 후 띄워놓고 -> end 출력
//		th1.start();
//		th2.start();
		
		MyThread2 runner1 = new MyThread2();
		// Thread 객체를 만들고 Thread 인스턴스에 Runnable 객체를 넣는다.
		Thread th1 = new Thread(runner1);
		th1.start();
		
		MyThread2 runner2 = new MyThread2();
		Thread th2 = new Thread(runner2);
		th2.start();
		System.out.println("end");
	}
}
