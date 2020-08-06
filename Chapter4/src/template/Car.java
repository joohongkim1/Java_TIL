package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	// ������ Ȯ�忡 ���̴� �޼���
	// ��� ���� ������ �ؾ��Ѵٸ� abstract ����
	public void washCar() {}
	
	// ���ø� �޼���
	// final Ű����� ������ �� �� ���� �޼������ �ȴ�.(�⺻ Ʋ�� �Ǵ� �޼����)
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}