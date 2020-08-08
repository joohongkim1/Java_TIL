package interfaceex;

public class CalcTest {
	
	public static void main(String[] args) {
		
		Calc calc = new CompleteCalc();
		int n1 = 10;
		int n2 = 20;
		
		
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
		
		// 재정의된 메서드가 실행된다.
		calc.description();
		
		
		int arr[] = {1, 2, 3, 4};
		// 인터페이스 타입으로 정적 메서드 호출
		// 인스턴스 생성과 상관없이 호출이 가능하다.
		int sum = Calc.total(arr);
		System.out.println(sum);
	}
}
