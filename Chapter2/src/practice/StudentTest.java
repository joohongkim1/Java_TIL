package practice;

public class StudentTest {

	public static void main(String[] args) {

		Student stuLee = new Student(100, "Lee");
		Student stuKim = new Student(101, "Kim");
		
		stuLee.addSubject("����", 50);
		stuLee.addSubject("����", 70);
		
		stuKim.addSubject("����", 80);
		stuKim.addSubject("����", 60);
		stuKim.addSubject("����", 90);
		
		stuLee.showStudentInfo();
		System.out.println("==================");
		stuKim.showStudentInfo();
	}

}
