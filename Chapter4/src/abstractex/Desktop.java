package abstractex;

// 하나의 추상 메서드라도 구현되지 않을 경우 abstract 클래스로 작성
//public abstract class Desktop extends Computer{}

public class Desktop extends Computer{
	
	@Override
	public void display() {
		System.out.println("Desktop display");
	}
	
	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}
	
	@Override
	public void turnOn() {
		System.out.println("Desktop turnOn");
	}

	@Override
	public void turnOff() {
		System.out.println("Desktop turnOff");
	}
}
