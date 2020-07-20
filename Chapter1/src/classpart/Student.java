package classpart;

//class Abc {} public 클래스와 자바 파일명이 같아야 한다.

public class Student {
	
	// 멤버 변수
	int studentID;
	String studentName;
	String address;
	
	// 필요한 경우 직접 기본 생성자를 생성해줄수 있다.
	// 기본 생성자가 없을 경우 StudentTest 에서 오류가 남.
	public Student() {};
	
	// 생성자 직접 구현, 클래스 이름과 같음.
	// 용도에 따라 다양한 생성자 구현 가능.
	// 같은 이름의 메서드지만 매개 변수가 다른 경우 -> 오버로딩
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		// 초기화를 하지 않은 address 의 경우 null 
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
}
