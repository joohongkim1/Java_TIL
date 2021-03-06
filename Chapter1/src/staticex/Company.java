package staticex;

// Singleton Pattern 예시
public class Company {
	
	private static Company instance = new Company();
	
	private Company() {};
	
	// 외부에서 인스턴스 생성과 상관없이 호출할 수 있게끔
	public static Company getInstance() {
		
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
