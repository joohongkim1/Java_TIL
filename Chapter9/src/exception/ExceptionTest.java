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
				// fis �� null �̱⶧����
				// close ����� �� NullPointException �߻�
				fis.close();
				System.out.println("finally");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		// finally ���� �� return �Ǿ��� ������ ������� �ʴ´�.
		System.out.println("end");
	}
}
