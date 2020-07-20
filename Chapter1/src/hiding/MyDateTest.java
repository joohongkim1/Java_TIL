package hiding;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		
		// 변수를 오픈해놨을 경우 맞지 않는 날짜를 입력해도 오류가 없다.
		// private 변수의 경우 getter, setter 로 핸들링 가능
//		date.day = 100;
//		date.month = 70;
//		date.year = 2020;
		
		date.setDay(20);
		date.setMonth(13);
		date.setYear(2020);
		
		date.showDate();
	}

}
