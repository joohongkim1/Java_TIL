package innerclass;

class Outer2 {
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num = 100;
		// anonymous inner class
		return new Runnable() {
			@Override
			public void run() {
			
				// getRunnable �޼��尡 ȣ��ż� ���� �������� ��ȿ�ϱ� ������ ��� �Ұ�
				// ���������� ����� �Ǿ� ���� ������ �Ұ����ϴ�. ������ ����.
				// num += 10;
				// i = 200;
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer2.sNum);
			}
			
		};
		
	}
	
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("test");
		}
	};
}

public class AnonymousInnerClassTest {
	
	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.runner.run();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
		
	}
}
