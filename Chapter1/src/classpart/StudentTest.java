package classpart;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student(); // ������ Student -> �޸𸮿� ����
		// �������� studentLee -> ���� �޸𸮿� �ö�
		// Student Ŭ������ ��� �������� �ν��Ͻ��� ������ ��(new) �� �޸𸮿� �ö�
		// ���� �޸��� studentLee �� ���� ��� �������� �����Ѵ�.
		studentLee.studentName = "����ȫ"; // �������� studentName
		studentLee.address = "������";
		
		studentLee.showStudentInfo();
		
		// ������ �ν��Ͻ��� ������ �޸𸮸� ���´�.
		Student studentKim = new Student();
		studentKim.studentName = "���ƶ�";
		studentKim.address = "����";
		
		studentKim.showStudentInfo();
		
		// ���� ���� ���
		System.out.println(studentLee);
		System.out.println(studentKim);
	}
}
