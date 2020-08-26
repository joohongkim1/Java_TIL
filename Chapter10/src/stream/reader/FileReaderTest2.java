package stream.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest2 {
	
	public static void main(String[] args) throws IOException {
		FileReader fis = new FileReader("reader.txt");
		
		int i;
		while( (i = fis.read()) != -1 ) {
			System.out.print((char)i);
		}
		
		// 보조 스트림을 close 하면 기존 스트림도 close 가 된다.
		fis.close();
		
	}
}
