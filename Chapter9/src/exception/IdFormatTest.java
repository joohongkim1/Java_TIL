package exception;

public class IdFormatTest {
	
	private String userId;
	
	
	
	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) throws IdFormatException {
		
		if( userId == null ) {
			throw new IdFormatException("아이디는 null 일 수 없습니다.");
		}
		else if( userId.length() < 8 || userId.length() > 20){
			throw new IdFormatException("아이디는 8자 이상 20자 이하여야 합니다");
		}
		
		this.userId = userId;
	}



	public static void main(String[] args) {
		
		IdFormatTest idTest = new IdFormatTest();
		
		String id = null;
		try {
			idTest.setUserId(id);
		} catch (IdFormatException e) {
			System.out.println(e);
		}
		
		id = "abc";
		
		try {
			idTest.setUserId(id);
		} catch (IdFormatException e) {
			System.out.println(e);
			return ;
		}
		
		System.out.println("아이디 확인");
		
	}
}
