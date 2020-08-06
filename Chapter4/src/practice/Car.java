package practice;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void start() {
		System.out.println("�õ��� �մϴ�.");
	};
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	final public void run() {
		start();
		drive();
		stop();
		turnOff();
	}
}
