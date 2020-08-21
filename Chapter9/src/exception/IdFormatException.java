package exception;

// 사용자 정의 예외
/* 매개변수로 전달된 아이디가 null 이거나 8자 이하 20자 이상인 경우 
 *  예외를 발생 시키는 예외 클래스를 직접 만들고 예외를 발생
 */
public class IdFormatException extends Exception {
	
	public IdFormatException(String message) {
		super(message);
	}

}
