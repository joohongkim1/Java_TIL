package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void readBooks() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� ������ ��� ���ư��ϴ�.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		
		// ��ĳ����
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		// hAnimal.readBooks() �Ⱥ���.
		// �ٿ� ĳ����
		/*
		Human human = (Human)hAnimal;
		human.readBooks();
		*/
		
		// Eagle �� �ٿ�ĳ������ �ص� ������ ������ ���� �ʴ´�.
		// Run �� �� ������ ����.
		// Eagle human2 = (Eagle)hAnimal;
		
		// hAnimal �� �ν��Ͻ��� Eagle �̸� ����
		// But, False �̱� ������ ������� �ʴ´�.
		if ( hAnimal instanceof Eagle) {
			Eagle human2 = (Eagle)hAnimal;
		}
		
		// instanceof ��������ν� ���������� ����ȯ ����. �Ű������� �߸� �Ѿ���� ��츦 ����
		if ( hAnimal instanceof Human) {
			Human human = (Human)hAnimal;
			human.readBooks();
			System.out.println("=============");
		}
		
		/*
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		*/
		
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
		
		// �� �ν��Ͻ��� move �� ȣ��(���� �޼��� ���)
		/*
		for(Animal animal: animalList) {
			animal.move();
		}
		*/
		
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i=0; i <list.size(); i++) {
			Animal animal = list.get(i);
			
			if ( animal instanceof Human) {
				Human human = (Human)animal;
				human.readBooks();
			} else if( animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			} else if( animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			} else {
				System.out.println("error");
			}
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	// ������ �޼��带 ����� 3���� ���� ������ �Ѵ�.
//	public void moveAnimal(Human animal) {
//		animal.move();
//	}

}
