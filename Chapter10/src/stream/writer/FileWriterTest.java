package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	
	public static void main(String[] args) throws IOException {
		
		// reader 와 같은 방식으로 보조 스트림 사용 가능
		FileWriter fw = new FileWriter("writer.txt");
		fw.write("A");
		char[] buf = {'B', 'C', 'D', 'E', 'F'};
		
		fw.write(buf);
		fw.write("안녕하세요");
		fw.write(buf, 2, 2);
		fw.close();
		
		System.out.println("end");
	}
}
