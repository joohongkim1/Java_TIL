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
		System.out.println(lineNum + "의 승객은 " + passengerCnt + "명이고, 수입은 " + income + "원 입니다.");
	}
	
}
