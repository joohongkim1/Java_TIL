package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("Korea", 90);
		studentLee.setMathSubject("Math", 100);
		
		studentLee.showStudentScore();
	}

}
