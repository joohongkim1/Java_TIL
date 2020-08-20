package practice;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
	public static void main(String[] args) {
		
		Customer customerLee = new Customer("�̼���", 40, 100);
		Customer customerKim = new Customer("������", 20, 100);
		Customer customerHong = new Customer("ȫ�浿", 13, 50);
		
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println(customerList);
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		int total = customerList.stream().mapToInt(c -> c.getCost()).sum();
		System.out.println(total);
		
		customerList.stream().filter(c -> c.getAge() >= 20)
		.map(n -> n.getName())
		.sorted()
		.forEach(s -> System.out.println(s));
		}
	
}
