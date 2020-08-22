package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			 fis = new FileInputStream("input.txt");
			 			 
			 int i;
			 while ( (i = fis.read()) != -1) {
			 		 System.out.print((char)i);
			 }
			 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// fis 가 null 인 상태에서  close 하기 떄문에 NullPointerException 발생
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("end");
	}

}
				