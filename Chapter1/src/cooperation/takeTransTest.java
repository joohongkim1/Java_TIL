package cooperation;

public class takeTransTest {
	public static void main(String[] args) {
		Student studentKim = new Student("Kim", 10000);
		Student studentLee = new Student("Lee", 50000);
		Student	studentPark = new Student("Park", 100000);
		
		Bus bus100 = new Bus(100);
		Subway subway7 = new Subway(7);
		Taxi taxi1234 = new Taxi(1234);
		
		studentKim.takeBus(bus100);
		studentLee.takeSubway(subway7);
		studentPark.takeTaxi(taxi1234);
		
		studentKim.showInfo();
		studentLee.showInfo();
		studentPark.showInfo();
		
		bus100.showBusInfo();
		subway7.showSubwayInfo();
		taxi1234.showTaxiInfo();
	}
}
