package thread;

public class JoinTest extends Thread {
	
	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		int i;
		for (i = start; i <= end; i++) {
			total += i;
		}
	}
	
	public static void main(String[] args) {
		
		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt1.start();
		jt2.start();
		
		// 메인 쓰레드에서 join 을 걸었다.
		// total 값 계산 전 기다린다.
		try {
			jt1.join();
			jt2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int total = jt1.total + jt2.total;
		System.out.println(total);
	}
}
