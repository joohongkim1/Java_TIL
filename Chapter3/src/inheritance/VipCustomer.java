package inheritance;

public class VipCustomer extends Customer {
	
	private int agentID;
	double salesRatio;
	
	public VipCustomer() {
		
		// private Ű������ ��� ��� ���迡���� �ٷ� ������ �Ұ����ϴ�.
		// ��� ���迡�� �����ϰ� �Ϸ��� protected Ű����� ���� �����ϴ�.
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
	}
}
