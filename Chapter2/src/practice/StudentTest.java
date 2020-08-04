package practice;

public class StudentTest {

	public static void main(String[] args) {

		Student stuLee = new Student(100, "Lee");
		Student stuKim = new Student(101, "Kim");
		
		stuLee.addSubject("국어", 50);
		stuLee.addSubject("수학", 70);
		
		stuKim.addSubject("국어", 80);
		stuKim.addSubject("수학", 60);
		stuKim.addSubject("영어", 90);
		
		stuLee.showStudentInfo();
		System.out.println("==================");
		stuKim.showStudentInfo();
	}

}
