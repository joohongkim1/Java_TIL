package staticex;

public class StudentIDTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student("Lee");
		// static ������ Ŭ���������� �����Ѵ�.
//		System.out.println(studentLee.serialNum);
		// �ν��Ͻ��� ������ ������� static ������ ��밡���ϴ�.
//		System.out.println(Student.serialNum);
		// private �� �����߱� ������ get �޼���� �����´�.
		System.out.println(Student.getSerialNum());
		
		Student studentKim = new Student("Kim");
		// �� ������ ���� �޸𸮸� �ٶ󺸰� �ֱ� ������ ���� ����.
		
		System.out.println(studentLee.getStudentID());
		System.out.println(studentKim.getStudentID());
	}
}
