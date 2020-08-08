package object;

class Book {
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// 재정의
	@Override
	public String toString() {
		return author + "," + title;
	}
	
}

public class ToStringTest {

	public static void main(String[] args) {
		
		Book book = new Book("토지", "박경리");
		
		// 주소 출력
		System.out.println(book);
		
		// String 클래스에는 toString 이 정의되어 있다.
		String str = new String("토지");
		System.out.println(str);
		// toString -> Object 의 메서드, String 클래스 안의 캐릭터 배열을 출력하도록 재정의
		System.out.println(str.toString());
	}

}
