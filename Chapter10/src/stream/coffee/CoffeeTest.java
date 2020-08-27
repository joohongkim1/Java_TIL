package stream.coffee;

public class CoffeeTest {
	
	public static void main(String[] args) {
		
		Coffee americano = new Americano();
		americano.brewing();
		System.out.println();
		
		Coffee latte = new Latte(new Americano());
		latte.brewing();
		System.out.println();
		
		// ���� ���ʿ� �ִ� ���� �Ϲ� ������Ʈ
		Coffee mocha = new Mocha(new Latte(new Americano()));
		mocha.brewing();
		System.out.println();
		
		Coffee ame2 = new Mocha(new Latte(new Americano2()));
		ame2.brewing();
	}
}
