package thread;

class MyThread2 implements Runnable {
	
	// �����尡 start �Ǹ� run �̶�� �޼ҵ尡 ����ȴ�.
	public void run() {
		int i;
		
		for( i = 0; i <= 200; i++) {
			System.out.print(i + "\t");
			
			try {
				// Thread Ŭ������ static �޼ҵ�
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
		
		// �����ư��鼭 ����ȴ�
		// ���� ���� ����Ǵ� ������� main ������
		// main ������ : start ��� -> Thread 2�� ���� �� ������� -> end ���
//		th1.start();
//		th2.start();
		
		MyThread2 runner1 = new MyThread2();
		// Thread ��ü�� ����� Thread �ν��Ͻ��� Runnable ��ü�� �ִ´�.
		Thread th1 = new Thread(runner1);
		th1.start();
		
		MyThread2 runner2 = new MyThread2();
		Thread th2 = new Thread(runner2);
		th2.start();
		System.out.println("end");
	}
}
