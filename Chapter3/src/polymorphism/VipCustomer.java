package polymorphism;

public class VipCustomer extends Customer {
	
	private int agentID;
	double salesRatio;
	
//	public VipCustomer() {
		
		// super() -> 상위 클래스의 메모리 위치를 가진다. 
		// 상위 클래스의 기본 생성자가 호출이 된다.
		// 코드에 없을 경우 컴파일 단계에서 super() 를 넣어준다.
		// 기본 생성자가 없고, 다른 생성자가 있을 경우에는 기본 생성자가 제공되지 않기 때문에,
		// super() 로 호출이 불가능하다.
		// 그럴 경우 super(1, "123") 등 생성자의 형식에 맞게 불러주면 된다.
//		super();
		// private 키워드의 경우 상속 관계에서도 바로 접근이 불가능하다.
		// 상속 관계에서 접근하게 하려면 protected 키워드로 접근 가능하다.
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		
//		System.out.println("VipCustomer() 생성자 호출");
//	}
	
	// 매개 변수가 있는 생성자만 존재하는 경우 하위 클래스에서 명시적으로 호출을 해야 한다.
	public VipCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	// 어노테이션
	@Override
	public int calcPrice(int price) {
		 bonusPoint += price * bonusRatio;
		 return price - (int)(price * salesRatio);
	}
}
