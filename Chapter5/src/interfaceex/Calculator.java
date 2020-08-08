package interfaceex;

public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	// 일부만 구현하게 될 경우 해당 클래스는 추상 클래스가 된다.
//	@Override
//	public int times(int num1, int num2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int divide(int num1, int num2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
