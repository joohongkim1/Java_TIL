package polymorphism;

public class VipCustomer extends Customer {
	
	private int agentID;
	double salesRatio;
	
//	public VipCustomer() {
		
		// super() -> ���� Ŭ������ �޸� ��ġ�� ������. 
		// ���� Ŭ������ �⺻ �����ڰ� ȣ���� �ȴ�.
		// �ڵ忡 ���� ��� ������ �ܰ迡�� super() �� �־��ش�.
		// �⺻ �����ڰ� ����, �ٸ� �����ڰ� ���� ��쿡�� �⺻ �����ڰ� �������� �ʱ� ������,
		// super() �� ȣ���� �Ұ����ϴ�.
		// �׷� ��� super(1, "123") �� �������� ���Ŀ� �°� �ҷ��ָ� �ȴ�.
//		super();
		// private Ű������ ��� ��� ���迡���� �ٷ� ������ �Ұ����ϴ�.
		// ��� ���迡�� �����ϰ� �Ϸ��� protected Ű����� ���� �����ϴ�.
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		
//		System.out.println("VipCustomer() ������ ȣ��");
//	}
	
	// �Ű� ������ �ִ� �����ڸ� �����ϴ� ��� ���� Ŭ�������� ��������� ȣ���� �ؾ� �Ѵ�.
	public VipCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	// ������̼�
	@Override
	public int calcPrice(int price) {
		 bonusPoint += price * bonusRatio;
		 return price - (int)(price * salesRatio);
	}
}
