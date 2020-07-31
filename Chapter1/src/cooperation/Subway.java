package cooperation;

public class Subway {
	
	int lineNum;
	int passengerCnt;
	int income;
	
	public Subway(int lineNum) {
		this.lineNum = lineNum;
	}
	
	public void take(int income) {
		passengerCnt++;
		this.income += income;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNum + "�� �°��� " + passengerCnt + "���̰�, ������ " + income + "�� �Դϴ�.");
	}
	
}
