package practice2;

public class StudentTest {

	public static void main(String[] args) {
		Student Lee = new Student(101, "Lee");
		Student Kim = new Student(102, "Kim");
		Student Cho = new Student(103, "Cho");
		
		Lee.addBook("�¹���1");
		Lee.addBook("�¹���2");
		
		Kim.addBook("����1");
		Kim.addBook("����2");
		Kim.addBook("����2");
		
		Cho.addBook("�ظ�����1");
		Cho.addBook("�ظ�����2");
		Cho.addBook("�ظ�����3");
		Cho.addBook("�ظ�����4");
		
		Lee.showStuInfo();
		Kim.showStuInfo();
		Cho.showStuInfo();
	}

}
