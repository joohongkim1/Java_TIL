package lambda;

public class TestStringConcat {
	
	public static void main(String[] args) {
		
		StringConImpl impl = new StringConImpl();
		impl.makeString("hello", "world");
		
		StringConcat concat = (s1, s2) -> System.out.println(s1 + ", " + s2);
		concat.makeString("hello", "world");
		
		
		// 익명 내부 클래스가 내부적으로 람다식에서 사용된다.
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		};
		
		concat2.makeString("hello", "world");
	}
}
