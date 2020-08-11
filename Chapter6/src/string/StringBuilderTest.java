package string;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		// 연결 전과 후의 주소 값이 같다.
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer));
		
		java = buffer.toString();
		System.out.println(java);
	}
}
