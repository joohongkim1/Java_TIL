package stream.coffee;

public class CoffeeTest {
	
	public static void main(String[] args) {
		
		Coffee americano = new Americano();
		americano.brewing();
		System.out.println();
		
		Coffee latte = new Latte(new Americano());
		latte.brewing();
		System.out.println();
		
		// 제일 안쪽에 있는 것은 일반 컴포넌트
		Coffee mocha = new Mocha(new Latte(new Americano()));
		mocha.brewing();
		System.out.println();
		
		Coffee ame2 = new Mocha(new Latte(new Americano2()));
		ame2.brewing();
	}
}
