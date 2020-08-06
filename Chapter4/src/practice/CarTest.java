package practice;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		
		ArrayList<Car> carList = new ArrayList<Car>();
		
		// 인스턴스 생성 후 넣어도 되고 바로 new 키워드로 생성도 가능
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		
		for(Car car: carList) {
			car.run();
			System.out.println("======================");
		}
		}

}
