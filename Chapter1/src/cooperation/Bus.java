package cooperation;

public class Bus {

	int busNum;
	int passengerCnt;
	int income;

	public Bus(int busNum) {
		this.busNum = busNum;
	}

	// �°� ����
	public void take(int income) {
		this.income += income;
		passengerCnt++;
	}

	public void showBusInfo() {
		System.out.println(busNum + "�� �°��� " + passengerCnt + "���̰�, ������ " + income + "�� �Դϴ�.");
	}

}
