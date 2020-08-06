package practice;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer c1 = new VIPCustomer(10010, "김유신", 1);
		Customer c2 = new GoldCustomer(10020, "이순신");
		Customer c3 = new GoldCustomer(10030, "조아란");
		Customer c4 = new Customer(10040, "김주홍");
		Customer c5 = new Customer(10050, "김정섭");
				
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		customerList.add(c4);
		customerList.add(c5);
	
		System.out.println("======== 고객 정보 출력 ======== ");
		for(Customer customer: customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 10000;
		System.out.println("===== 지불 금액 및 적립 포인트 조회 =====");
		for(Customer customer: customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() 
					+ "님의 지불 금액은 " + cost + "원 이며, 적립 포인트는 "
					+ customer.bonusPoint + "점 입니다.");
		}
		
		
		
		
	}
}
