package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
		// �߻� Ŭ������ Computer �δ� �ν��Ͻ� ���� �Ұ���
//		Computer c1 = new Computer();
		
		Computer d1 = new Desktop();
		d1.turnOn();
		d1.display();
		d1.typing();
		d1.turnOff();
		Computer n1 = new MyNoteBook();
		n1.turnOn();
		n1.display();
		n1.typing();
		n1.turnOff();
	}

}
