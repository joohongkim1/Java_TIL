package abstractex;

public abstract class Computer {
	
	// {} 가 구현부이므로 추상 메서드가 아니다.
	//	public void display() {}
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
