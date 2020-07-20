package hiding;

public class MyDate {

	// 기본 접근 제어자 : 같은 패키지내에서만 사용
	// public 으로 할 경우 다른 패키지에서 사용가능
//	int day;
//	int month;
//	int year;

	private int day;
	private int month;
	private int year;

	private boolean isValid = true;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		// this.day 는 위의 day(멤버 변수), 우측 day 는 매개 변수 day
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {

		if (month < 1 || month > 12) {
			isValid = false;
		} else {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void showDate() {

		if (isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}

}
