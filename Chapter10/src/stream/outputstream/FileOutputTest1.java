package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {
	
	public static void main(String[] args) {
		
		// default 는 false , true 값으로 하면 이어서 쓸 수 있다.(append)
		try(FileOutputStream fos = new FileOutputStream("output.txt", true)){
			
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
