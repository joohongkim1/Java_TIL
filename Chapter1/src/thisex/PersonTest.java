package thisex;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person1 = new Person("����ȫ", 29);
		Person person2 = new Person();
		person1.showInfo();		
		person2.showInfo();
		System.out.println(person1);
		
		// this�� ���� �� ���
		Person p = person1.getSelf();
		System.out.println(p);
	}

}
