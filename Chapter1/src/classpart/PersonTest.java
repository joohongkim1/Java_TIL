package classpart;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personJames = new Person();
		personJames.age = 40;
		personJames.name = "James";
		personJames.married = true;
		personJames.numOfChildren = 3;
		
		personJames.showPersonInfo();
		
	}

}
