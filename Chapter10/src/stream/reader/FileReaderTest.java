package stream.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	
	public static void main(String[] args) throws IOException {
		// ����Ʈ ������ �о �ѱ��� ������ ��µȴ�.
//		FileInputStream fis = new FileInputStream("reader.txt");
		FileReader fr = new FileReader("reader.txt");
		int i;
		while( (i = fr.read()) != -1 ) {
			System.out.print((char)i);
		}
		
		fr.close();
		
	}
}
