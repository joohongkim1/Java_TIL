package staticex;

public class Student {
	
//	public static int serialNum = 1000;
	// 아무곳에서나 변경할 수 없도록 private 키워드로 생성
	private static int serialNum = 1000;
	private int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
		serialNum++; // 학생이 생성될 때마다 시리얼 넘버 +1
		// 학생 ID 에 학번 할당
		studentID = serialNum;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소 없음";
		serialNum++; // 학생이 생성될 때마다 시리얼 넘버 +1
		studentID = serialNum;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	// 학번은 변하면 안되기 때문에 set 메서드는 작성하지 않는다.
	public int getStudentID() {
//		serialNum++; 인스턴스 메서드에서 static 변수를 사용하는 것은 문제가 되지 않는다.
		// 프로그램이 메모리에 로드될 때 생성되기 떄문
		// static 은 큰 메모리를 사용하면 안된다.
		return studentID;
	}
	
	public static int getSerialNum() {
		int i = 0; // 지역 변수 선언 문제 없음
//		studentName = "Lee"; -> static 메서드 안에서 인스턴스 변수 사용 불가
		
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
}
