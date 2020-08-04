package practice2;

public class StudentTest {

	public static void main(String[] args) {
		Student Lee = new Student(101, "Lee");
		Student Kim = new Student(102, "Kim");
		Student Cho = new Student(103, "Cho");
		
		Lee.addBook("태백산맥1");
		Lee.addBook("태백산맥2");
		
		Kim.addBook("토지1");
		Kim.addBook("토지2");
		Kim.addBook("토지2");
		
		Cho.addBook("해리포터1");
		Cho.addBook("해리포터2");
		Cho.addBook("해리포터3");
		Cho.addBook("해리포터4");
		
		Lee.showStuInfo();
		Kim.showStuInfo();
		Cho.showStuInfo();
	}

}
