package stream.inputstream;

import java.io.Console;

// ��Ŭ�����ʹ� ���� ���� �ʾ� �ܼ� ȭ�鿡�� run �ؾ��Ѵ�.
public class ConsoleTest {
	
	public static void main(String[] args) {
		
		Console console = System.console();
		
		System.out.println("�̸�:");
		String name = console.readLine();
		System.out.println("��й�ȣ:");
		char[] password = console.readPassword();
		
		System.out.println(name + ", " + password);
	}
}
