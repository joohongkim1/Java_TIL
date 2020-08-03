package staticex;

// Singleton Pattern ����
public class Company {
	
	private static Company instance = new Company();
	
	private Company() {};
	
	// �ܺο��� �ν��Ͻ� ������ ������� ȣ���� �� �ְԲ�
	public static Company getInstance() {
		
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
