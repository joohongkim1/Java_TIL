package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		
//		Customer customerLee = new Customer();
//		customerLee.setCustomerName("Lee");
//		customerLee.setCustomerID(10010);
//		customerLee.bonusPoint = 1000;
//		System.out.println(customerLee.showCustomerInfo());
		
		
		// Customer 타입을 내포하고 있기 때문에 가능(업캐스팅)
		Customer customerKim = new VipCustomer(10020, "김유신");
//		customerKim.setCustomerName("Kim");
//		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
	
	}

}
