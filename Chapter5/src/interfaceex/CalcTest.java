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
		
		// �����ǵ� �޼��尡 ����ȴ�.
		calc.description();
		
		
		int arr[] = {1, 2, 3, 4};
		// �������̽� Ÿ������ ���� �޼��� ȣ��
		// �ν��Ͻ� ������ ������� ȣ���� �����ϴ�.
		int sum = Calc.total(arr);
		System.out.println(sum);
	}
}
