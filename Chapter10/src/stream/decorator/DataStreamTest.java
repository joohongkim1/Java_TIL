package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {
	
	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("data.txt");
		DataOutputStream dos = new DataOutputStream(fos);
				FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis)){
			
			// 1바이트
			dos.writeByte(100);
			// 4바이트, 위와 다름
			dos.write(100);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			
			// 위의 형식에 맞게 읽어야 함.
			System.out.println(dis.readByte());
			System.out.println(dis.read());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
