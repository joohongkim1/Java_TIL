package abstractex;

// �ϳ��� �߻� �޼���� �������� ���� ��� abstract Ŭ������ �ۼ�
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
