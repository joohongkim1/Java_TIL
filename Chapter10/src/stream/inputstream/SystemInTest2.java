package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {
	
	public static void main(String[] args) {
		
		System.out.println("�Է�r : ");
		
		try {
			int i;
			// ������Ʈ��
			InputStreamReader isr = new InputStreamReader(System.in);
			while ( (i = isr.read()) != '��') {
			System.out.print(i);
			System.out.print((char)i);
			}
		} catch (IOException e) {
		}
	}
}
