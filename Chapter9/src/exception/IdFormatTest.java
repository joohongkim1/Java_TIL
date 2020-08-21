package exception;

public class IdFormatTest {
	
	private String userId;
	
	
	
	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) throws IdFormatException {
		
		if( userId == null ) {
			throw new IdFormatException("���̵�� null �� �� �����ϴ�.");
		}
		else if( userId.length() < 8 || userId.length() > 20){
			throw new IdFormatException("���̵�� 8�� �̻� 20�� ���Ͽ��� �մϴ�");
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
		
		System.out.println("���̵� Ȯ��");
		
	}
}
