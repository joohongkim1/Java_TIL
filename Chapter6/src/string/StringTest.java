package string;

public class StringTest {
	
	public static void main(String[] args) {
		
		// 힙 메모리에 할당
		String str1 = new String("abc");
		// 상수풀의 문자열을 가져옴
		String str2 = "abc";
		
		// false
		System.out.println(str1 == str2);
		
		String str3 = "abc";
		String str4 = "abc";
		
		// true
		System.out.println(str3 == str4);
	}
}
