package classpart;

//class Abc {} public Ŭ������ �ڹ� ���ϸ��� ���ƾ� �Ѵ�.

public class Student {
	
	// ��� ����
	int studentID;
	String studentName;
	String address;
	
	// �ʿ��� ��� ���� �⺻ �����ڸ� �������ټ� �ִ�.
	// �⺻ �����ڰ� ���� ��� StudentTest ���� ������ ��.
	public Student() {};
	
	// ������ ���� ����, Ŭ���� �̸��� ����.
	// �뵵�� ���� �پ��� ������ ���� ����.
	// ���� �̸��� �޼������� �Ű� ������ �ٸ� ��� -> �����ε�
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		// �ʱ�ȭ�� ���� ���� address �� ��� null 
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
}
