package lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {
	
	public static void main(String[] args) {
		
		// �Լ��� �����ΰ� �ٷ� ������ ����
		PrintString lambda = s -> System.out.println(s);
		lambda.showString("Test");
		
		// ������ �Ű������� �Ѿ �� �����ΰ� ����ȴ�.
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
