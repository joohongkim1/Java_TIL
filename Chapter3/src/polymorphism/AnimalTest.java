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
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		
		// ��ĳ����
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
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
		
		// �� �ν��Ͻ��� move �� ȣ��(���� �޼��� ���)
		for(Animal animal: animalList) {
			animal.move();
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
