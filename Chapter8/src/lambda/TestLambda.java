package lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {
	
	public static void main(String[] args) {
		
		// 함수의 구현부가 바로 변수에 대입
		PrintString lambda = s -> System.out.println(s);
		lambda.showString("Test");
		
		// 변수가 매개변수로 넘어간 후 구현부가 실행된다.
		showMyString(lambda);
		
		PrintString test = returnString();
		test.showString("Test3");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("Test2");
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + "!");
	}
}
