package exception;

// ����� ���� ����
/* �Ű������� ���޵� ���̵� null �̰ų� 8�� ���� 20�� �̻��� ��� 
 *  ���ܸ� �߻� ��Ű�� ���� Ŭ������ ���� ����� ���ܸ� �߻�
 */
public class IdFormatException extends Exception {
	
	public IdFormatException(String message) {
		super(message);
	}

}
