package hiding;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		
		// ������ �����س��� ��� ���� �ʴ� ��¥�� �Է��ص� ������ ����.
		// private ������ ��� getter, setter �� �ڵ鸵 ����
//		date.day = 100;
//		date.month = 70;
//		date.year = 2020;
		
		date.setDay(20);
		date.setMonth(13);
		date.setYear(2020);
		
		date.showDate();
	}

}
