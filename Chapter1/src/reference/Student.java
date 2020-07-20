package reference;

public class Student {
	
	int stuID;
	String stuName;
	
	// ���� �ڷ��� Ÿ������ ���� ����
	Subject korea;
	Subject math;
	
	// ������ �����ڿ��� �ʱ�ȭ
	// Stirng �� ��쿡�� new Ű����� �������ص� �ȴ�.
	public Student(int id, String name) {
		stuID = id;
		stuName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(stuName + "�� ������ " + total + "�� �Դϴ�.");
	}
}
