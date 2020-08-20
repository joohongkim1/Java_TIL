package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return;
		} finally {
			try {
				// fis 가 null 이기때문에
				// close 실행될 때 NullPointException 발생
				fis.close();
				System.out.println("finally");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		// finally 수행 후 return 되었기 때문에 실행되지 않는다.
		System.out.println("end");
	}
}
