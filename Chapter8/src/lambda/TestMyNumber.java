package lambda;

public class TestMyNumber {
	
	public static void main(String[] args) {
		
		// return �� �ϳ��� ��� �߰�ȣ�� return ���� ����
		MyMaxNumber max = (x, y) -> (x >= y) ? x : y;
		System.out.println(max.getMaxNum(10, 20));
	}
}
