package staticex;

public class StudentIDTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student("Lee");
		// static 변수는 클래스명으로 접근한다.
//		System.out.println(studentLee.serialNum);
		// 인스턴스의 생성과 상관없이 static 변수는 사용가능하다.
//		System.out.println(Student.serialNum);
		// private 로 선언했기 때문에 get 메서드로 가져온다.
		System.out.println(Student.getSerialNum());
		
		Student studentKim = new Student("Kim");
		// 두 변수가 같은 메모리를 바라보고 있기 때문에 값이 같다.
		
		System.out.println(studentLee.getStudentID());
		System.out.println(studentKim.getStudentID());
	}
}
