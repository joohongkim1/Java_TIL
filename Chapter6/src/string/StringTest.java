package string;

public class StringTest {
	
	public static void main(String[] args) {
		
		// �� �޸𸮿� �Ҵ�
		String str1 = new String("abc");
		// ���Ǯ�� ���ڿ��� ������
		String str2 = "abc";
		
		// false
		System.out.println(str1 == str2);
		
		String str3 = "abc";
		String str4 = "abc";
		
		// true
		System.out.println(str3 == str4);
	}
}
