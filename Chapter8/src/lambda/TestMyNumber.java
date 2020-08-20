package lambda;

public class TestMyNumber {
	
	public static void main(String[] args) {
		
		// return 문 하나인 경우 중괄호와 return 생략 가능
		MyMaxNumber max = (x, y) -> (x >= y) ? x : y;
		System.out.println(max.getMaxNum(10, 20));
	}
}
