package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 펴고 날아갑니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		
		// 업캐스팅
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		// hAnimal.readBooks() 안보임.
		// 다운 캐스팅
		/*
		Human human = (Human)hAnimal;
		human.readBooks();
		*/
		
		// Eagle 로 다운캐스팅을 해도 컴파일 에러가 나지 않는다.
		// Run 할 때 에러가 난다.
		// Eagle human2 = (Eagle)hAnimal;
		
		// hAnimal 의 인스턴스가 Eagle 이면 실행
		// But, False 이기 때문에 실행되지 않는다.
		if ( hAnimal instanceof Eagle) {
			Eagle human2 = (Eagle)hAnimal;
		}
		
		// instanceof 사용함으로써 안정적으로 형변환 가능. 매개변수가 잘못 넘어오는 경우를 방지
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
		
		// 각 인스턴스의 move 가 호출(가상 메서드 방식)
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
	
	// 각각의 메서드를 만들면 3개를 따로 만들어야 한다.
//	public void moveAnimal(Human animal) {
//		animal.move();
//	}

}
