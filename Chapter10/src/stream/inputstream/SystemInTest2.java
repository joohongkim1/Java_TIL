package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {
	
	public static void main(String[] args) {
		
		System.out.println("입력r : ");
		
		try {
			int i;
			// 보조스트림
			InputStreamReader isr = new InputStreamReader(System.in);
			while ( (i = isr.read()) != '끝') {
			System.out.print(i);
			System.out.print((char)i);
			}
		} catch (IOException e) {
		}
	}
}
