package practice;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer c1 = new VIPCustomer(10010, "������", 1);
		Customer c2 = new GoldCustomer(10020, "�̼���");
		Customer c3 = new GoldCustomer(10030, "���ƶ�");
		Customer c4 = new Customer(10040, "����ȫ");
		Customer c5 = new Customer(10050, "������");
				
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		customerList.add(c4);
		customerList.add(c5);
	
		System.out.println("======== �� ���� ��� ======== ");
		for(Customer customer: customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 10000;
		System.out.println("===== ���� �ݾ� �� ���� ����Ʈ ��ȸ =====");
		for(Customer customer: customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() 
					+ "���� ���� �ݾ��� " + cost + "�� �̸�, ���� ����Ʈ�� "
					+ customer.bonusPoint + "�� �Դϴ�.");
		}
		
		
		
		
	}
}
