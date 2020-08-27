package thread;

class MyThread extends Thread {
	
	// 쓰레드가 start 되면 run 이라는 메소드가 실행된다.
	public void run() {
		int i;
		
		for( i = 0; i <= 200; i++) {
			System.out.print(i + "\t");
			
			try {
				// Thread 클래스의 static 메소드
				sleep(10);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadTest {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		// 번갈아가면서 실행된다
		// 가장 먼저 종료되는 쓰레드는 main 쓰레드
		// main 쓰레드 : start 출력 -> Thread 2개 만든 후 띄워놓고 -> end 출력
		th1.start();
		th2.start();
		System.out.println("end");
	}
}
