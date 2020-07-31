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
		System.out.println(taxiNum + "¹ø ÅÃ½Ã ½Â°´ ¼ö ¹× ¼öÀÔ : " + passengerCnt + "," + income);
	}
}
