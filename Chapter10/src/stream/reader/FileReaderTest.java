package stream.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	
	public static void main(String[] args) throws IOException {
		// 바이트 단위로 읽어서 한글이 깨져서 출력된다.
//		FileInputStream fis = new FileInputStream("reader.txt");
		FileReader fr = new FileReader("reader.txt");
		int i;
		while( (i = fr.read()) != -1 ) {
			System.out.print((char)i);
		}
		
		fr.close();
		
	}
}
