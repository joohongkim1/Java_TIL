package reference;

public class Student {
	
	int stuID;
	String stuName;
	
	// 참조 자료형 타입으로 변수 선언
	Subject korea;
	Subject math;
	
	// 변수를 생성자에서 초기화
	// Stirng 의 경우에는 new 키워드로 생성안해도 된다.
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
		System.out.println(stuName + "의 총점은 " + total + "점 입니다.");
	}
}
