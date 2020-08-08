package object;


class Student {
	int stuID;
	String stuName;
	
	public Student(int stuID, String stuName) {
		this.stuID = stuID;
		this.stuName = stuName;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		// 다운 캐스팅
		if( obj instanceof Student) {
			Student std = (Student)obj;
			
			if (this.stuName == std.stuName) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
public class EqualsTest {
	
	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// '==' 는 메모리 주소가 같은지 판별
		System.out.println(str1 == str2);
		
		// true
		System.out.println(str1.equals(str2));
		
		Student Lee = new Student(100, "이순신");
		Student Lee2 = Lee;
		Student Shin = new Student(100, "이순신");
		
		System.out.println(Lee == Lee2);
		System.out.println(Lee == Shin);
		
		System.out.println(Lee.equals(Shin));
		
		System.out.println(Lee2.hashCode());
		System.out.println(Lee.hashCode());
	}
}
