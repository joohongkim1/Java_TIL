package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		
//		Customer customerLee = new Customer();
//		customerLee.setCustomerName("Lee");
//		customerLee.setCustomerID(10010);
//		customerLee.bonusPoint = 1000;
//		System.out.println(customerLee.showCustomerInfo());
		
		
		// Customer Ÿ���� �����ϰ� �ֱ� ������ ����(��ĳ����)
		Customer customerKim = new VipCustomer(10020, "������");
//		customerKim.setCustomerName("Kim");
//		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
	
	}

}
