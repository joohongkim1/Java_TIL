package interfaceex;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// 디폴트 메서드
	default void description() {
		System.out.println("정수 계산기 구현");
//		myMethod();
	}
	
	// 정적 메서드
	static int total(int[] arr) {
		int total = 0;
		
		for(int i: arr) {
			total += i;
		}
//		myStaticMethod();
		return total;
	}
	
	// 프라이빗 메서드의 종류 : 일반 메서드, 정적 메서드
	// Java 9 아니라 당장 못했음.
	/*
	 * private void myMethod() { System.out.println("private method"); }
	 */
	
	/*
	 * private static void myStaticMethod() {
	 * System.out.println("private static method"); }
	 */
	
}
