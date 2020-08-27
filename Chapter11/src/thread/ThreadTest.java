package thread;

class MyThread extends Thread {
	
	// �����尡 start �Ǹ� run �̶�� �޼ҵ尡 ����ȴ�.
	public void run() {
		int i;
		
		for( i = 0; i <= 200; i++) {
			System.out.print(i + "\t");
			
			try {
				// Thread Ŭ������ static �޼ҵ�
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
		
		// �����ư��鼭 ����ȴ�
		// ���� ���� ����Ǵ� ������� main ������
		// main ������ : start ��� -> Thread 2�� ���� �� ������� -> end ���
		th1.start();
		th2.start();
		System.out.println("end");
	}
}
