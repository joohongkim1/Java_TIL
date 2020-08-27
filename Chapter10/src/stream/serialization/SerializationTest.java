package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


// 이 객체가 직렬화 가능하다는 것을 알려주기 위해 implement Serializable 명시
// Externalizable 인터페이스도 있다. 알아볼 것.
class Person implements Serializable {
	String name;
	// transient -> 이 값은 직렬화 하지 않는다
	transient String job;
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;
	}
}

public class SerializationTest {
	
	public static void main(String[] args) {
		
		Person personLee = new Person("이순신", "SI");
		Person personKim = new Person("김유신", "SM");
		
		try( FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		try( FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		} catch(IOException e) {
			System.out.println(e);
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}
	}
}
