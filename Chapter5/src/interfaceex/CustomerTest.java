package interfaceex;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.buy();
		c1.sell();
		c1.order();
		c1.sayHello();
		
		// 자신의 메서드만 호출이 가능
		Buy buyer = c1;
		buyer.buy();
		buyer.order();
		
		// default 메서드를 뒀다고 하더라도
		// 이 떄 호출되는 order 는 인스턴스의 order
		Sell seller = c1;
		seller.sell();
		seller.order();
		
		// 다운 캐스팅도 가능
		if (seller instanceof Customer) {};
	}
}
