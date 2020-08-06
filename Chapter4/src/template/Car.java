package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	// 구현의 확장에 쓰이는 메서드
	// 모든 차가 세차를 해야한다면 abstract 선언
	public void washCar() {}
	
	// 템플릿 메서드
	// final 키워드로 재정의 할 수 없는 메서드들이 된다.(기본 틀이 되는 메서드들)
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
