package cooperation;

public class Student {

	String stuName;
	int grade;
	int money;
	
	public Student(String stuName, int money) {
		this.stuName = stuName;
		this.money = money;
	}
	
	// °´Ã¼ °£ Çù¾÷, °´Ã¼¸¦ ¹Þ°í ÇØ´ç °´Ã¼ÀÇ ¸Þ¼Òµå¸¦ È£Ãâ
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(4500);
		this.money -= 4500;
	}
	
	public void showInfo() {
		System.out.println(stuName + "´ÔÀÇ ÀÜ¾× : " + money + "¿ø");
	}
}
