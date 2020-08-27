package thread;

public class InterruptTest extends Thread {
	
	public void run() {
		
		int i;
		for(i = 0; i <= 99; i++) {
			System.out.println(i);
		}
		
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
			System.out.println("Wake");
		}
	}
	public static void main(String[] args) {
		
		InterruptTest test = new InterruptTest();
		test.start();
		// 5초를 기다리지 않고 Exception 으로 빠진다.
		test.interrupt();
		
		System.out.println("end");
	}
}
