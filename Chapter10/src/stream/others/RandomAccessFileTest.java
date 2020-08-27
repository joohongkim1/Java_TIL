package stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println(rf.getFilePointer());
		rf.writeDouble(3.14);
		rf.writeUTF("안녕하세요");
		
		// 현재 위치가 UTF 포맷이 들어있기 때문에 그냥 실행하면 오류
//		int i = rf.readInt();
		// 처음 위치로 돌아간다.
		rf.seek(0);
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		rf.close();
	}
}
