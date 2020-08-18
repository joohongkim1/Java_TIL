package innerclass;

class OutClass {
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	// �ַ� �ƿ�Ŭ������ �����ڿ��� �����Ѵ�.
	public OutClass() {
		inClass = new InClass();
	}
	// �ν��Ͻ� ���� Ŭ����
	// �ȿ��� static ���� ��� �Ұ�
	class InClass {
		int iNum = 100;
		
		void inTest() {
			// �ܺ� Ŭ������ private ���� ��� ����
			System.out.println(num);
			// static ������ ��� ����
			System.out.println(sNum);
		}
	}
	// private ������ ���� ������ �� ��.
	public void usingInner() {
		inClass.inTest();
	}
	
	// static innerClass
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
		
		// �Ϲ� �޼���
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			// outClass �� sNum
			System.out.println(sNum);
		}
		
		// static �޼��� <- static Ŭ���������� ����
		static void sTest() {
			// Ŭ���� ���� ���Ŀ� ��������� �����⶧���� �Ϲݸ޼��忡���� ��밡���ϴ�.
            // System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
	}
}

public class InnerTest {
	
	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		// private ������ ���� ������ �� ��.
		outClass.usingInner();
		
		System.out.println();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		OutClass.InStaticClass.sTest();
		
	}
}
