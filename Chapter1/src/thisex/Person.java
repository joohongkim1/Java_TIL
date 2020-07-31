package thisex;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		this("이름 없음", 1); // 인스턴스 생성을 초기화
		// this 로 다른 생성자를 호출할 때 해당 구문이 first statement 여야 한다.
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name + "," + age);
	}
	
	// 자신의 주소를 반환시 반환 타입은 클래스 자신
	public Person getSelf() {
		return this;
	}
	
}
