package interfaceex;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.buy();
		c1.sell();
		c1.order();
		c1.sayHello();
		
		// �ڽ��� �޼��常 ȣ���� ����
		Buy buyer = c1;
		buyer.buy();
		buyer.order();
		
		// default �޼��带 �״ٰ� �ϴ���
		// �� �� ȣ��Ǵ� order �� �ν��Ͻ��� order
		Sell seller = c1;
		seller.sell();
		seller.order();
		
		// �ٿ� ĳ���õ� ����
		if (seller instanceof Customer) {};
	}
}
