package innerclass;

class OutClass {
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	// 주로 아웃클래스의 생성자에서 선언한다.
	public OutClass() {
		inClass = new InClass();
	}
	// 인스턴스 내부 클래스
	// 안에서 static 변수 사용 불가
	class InClass {
		int iNum = 100;
		
		void inTest() {
			// 외부 클래스의 private 변수 사용 가능
			System.out.println(num);
			// static 변수도 사용 가능
			System.out.println(sNum);
		}
	}
	// private 변수라 직접 접근은 안 됨.
	public void usingInner() {
		inClass.inTest();
	}
	
	// static innerClass
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
		
		// 일반 메서드
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			// outClass 의 sNum
			System.out.println(sNum);
		}
		
		// static 메서드 <- static 클래스에서만 가능
		static void sTest() {
			// 클래스 생성 이후에 만들어지는 변수기때문에 일반메서드에서만 사용가능하다.
            // System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
	}
}

public class InnerTest {
	
	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		// private 변수라 직접 접근은 안 됨.
		outClass.usingInner();
		
		System.out.println();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		OutClass.InStaticClass.sTest();
		
	}
}
