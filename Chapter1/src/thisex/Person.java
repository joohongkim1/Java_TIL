package thisex;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		this("�̸� ����", 1); // �ν��Ͻ� ������ �ʱ�ȭ
		// this �� �ٸ� �����ڸ� ȣ���� �� �ش� ������ first statement ���� �Ѵ�.
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name + "," + age);
	}
	
	// �ڽ��� �ּҸ� ��ȯ�� ��ȯ Ÿ���� Ŭ���� �ڽ�
	public Person getSelf() {
		return this;
	}
	
}
