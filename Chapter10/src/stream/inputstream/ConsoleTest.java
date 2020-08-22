package stream.inputstream;

import java.io.Console;

// 이클립스와는 연동 되지 않아 콘솔 화면에서 run 해야한다.
public class ConsoleTest {
	
	public static void main(String[] args) {
		
		Console console = System.console();
		
		System.out.println("이름:");
		String name = console.readLine();
		System.out.println("비밀번호:");
		char[] password = console.readPassword();
		
		System.out.println(name + ", " + password);
	}
}
