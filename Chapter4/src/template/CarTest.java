package template;

public class CarTest {
	public static void main(String[] args) {
		
		AICar aiCar = new AICar();
		aiCar.run();
		
		System.out.println("====================");
		ManualCar mCar = new ManualCar();
		mCar.run();
	}
}
