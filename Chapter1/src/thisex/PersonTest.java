package thisex;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person1 = new Person("김주홍", 29);
		Person person2 = new Person();
		person1.showInfo();		
		person2.showInfo();
		System.out.println(person1);
		
		// this를 받은 후 출력
		Person p = person1.getSelf();
		System.out.println(p);
	}

}
