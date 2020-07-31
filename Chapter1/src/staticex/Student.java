package staticex;

public class Student {
	
//	public static int serialNum = 1000;
	// �ƹ��������� ������ �� ������ private Ű����� ����
	private static int serialNum = 1000;
	private int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
		serialNum++; // �л��� ������ ������ �ø��� �ѹ� +1
		// �л� ID �� �й� �Ҵ�
		studentID = serialNum;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "�ּ� ����";
		serialNum++; // �л��� ������ ������ �ø��� �ѹ� +1
		studentID = serialNum;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	// �й��� ���ϸ� �ȵǱ� ������ set �޼���� �ۼ����� �ʴ´�.
	public int getStudentID() {
//		serialNum++; �ν��Ͻ� �޼��忡�� static ������ ����ϴ� ���� ������ ���� �ʴ´�.
		// ���α׷��� �޸𸮿� �ε�� �� �����Ǳ� ����
		// static �� ū �޸𸮸� ����ϸ� �ȵȴ�.
		return studentID;
	}
	
	public static int getSerialNum() {
		int i = 0; // ���� ���� ���� ���� ����
//		studentName = "Lee"; -> static �޼��� �ȿ��� �ν��Ͻ� ���� ��� �Ұ�
		
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
}
