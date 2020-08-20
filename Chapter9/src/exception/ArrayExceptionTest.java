package exception;

public class ArrayExceptionTest {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		try {
		// ArrayIndexOutOfBoundsException
		for(int i = 0; i <= 5; i++) {
			System.out.println(arr[i]);
		}
		// 서버가 죽는 것이랑은 다르다.
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("예외처리");
		}
		System.out.println("프로그램 종료");
	}
}
