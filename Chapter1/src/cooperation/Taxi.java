package cooperation;

public class Taxi {
	
	int taxiNum;
	int passengerCnt;
	int income;
	
	public Taxi(int taxiNum) {
		this.taxiNum = taxiNum;
	}
	
	public void take(int income) {
		passengerCnt++;
		this.income += income;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiNum + "�� �ý� �°� �� �� ���� : " + passengerCnt + "," + income);
	}
}
