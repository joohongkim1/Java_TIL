package classpart;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student(); // 생성자 Student -> 메모리에 생성
		// 지역변수 studentLee -> 스택 메모리에 올라감
		// Student 클래스의 멤버 변수들이 인스턴스가 생성될 때(new) 힙 메모리에 올라감
		// 스택 메모리의 studentLee 가 힙의 멤버 변수들을 참조한다.
		studentLee.studentName = "김주홍"; // 참조변수 studentName
		studentLee.address = "의정부";
		
		studentLee.showStudentInfo();
		
		// 각각의 인스턴스는 별개의 메모리를 갖는다.
		Student studentKim = new Student();
		studentKim.studentName = "조아란";
		studentKim.address = "용인";
		
		studentKim.showStudentInfo();
		
		// 참조 변수 출력
		System.out.println(studentLee);
		System.out.println(studentKim);
	}
}
