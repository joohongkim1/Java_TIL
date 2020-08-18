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
			
				// getRunnable 메서드가 호출돼서 끝날 때까지만 유효하기 때문에 사용 불가
				// 내부적으로 상수가 되어 값의 수정이 불가능하다. 참조는 가능.
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
