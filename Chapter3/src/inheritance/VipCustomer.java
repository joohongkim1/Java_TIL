package inheritance;

public class VipCustomer extends Customer {
	
	private int agentID;
	double salesRatio;
	
	public VipCustomer() {
		
		// private 키워드의 경우 상속 관계에서도 바로 접근이 불가능하다.
		// 상속 관계에서 접근하게 하려면 protected 키워드로 접근 가능하다.
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
	}
}
