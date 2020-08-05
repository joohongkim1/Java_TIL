package inheritance;

public class OverridingTest {
	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		
		VipCustomer customerKim = new VipCustomer(10020,"������");
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo() + ", " + priceLee);
		System.out.println(customerKim.showCustomerInfo() + ", " + priceKim);
		
		// calcPrice �� VipCustomer �� �޼���� ȣ��ȴ�.
		Customer customerJo = new VipCustomer(10030, "����ȫ");
		customerJo.bonusPoint = 10000;
		
		int priceJo = customerJo.calcPrice(10000);
		System.out.println(customerJo.showCustomerInfo() + ", " + priceJo);
		
	}
}
