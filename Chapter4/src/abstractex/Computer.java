package abstractex;

public abstract class Computer {
	
	// {} �� �������̹Ƿ� �߻� �޼��尡 �ƴϴ�.
	//	public void display() {}
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
