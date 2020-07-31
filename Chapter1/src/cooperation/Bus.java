package cooperation;

public class Bus {

	int busNum;
	int passengerCnt;
	int income;

	public Bus(int busNum) {
		this.busNum = busNum;
	}

	// ½Â°´ ½ÂÂ÷
	public void take(int income) {
		this.income += income;
		passengerCnt++;
	}

	public void showBusInfo() {
		System.out.println(busNum + "ÀÇ ½Â°´Àº " + passengerCnt + "¸íÀÌ°í, ¼öÀÔÀº " + income + "¿ø ÀÔ´Ï´Ù.");
	}

}
