package object;

class Book {
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// ������
	@Override
	public String toString() {
		return author + "," + title;
	}
	
}

public class ToStringTest {

	public static void main(String[] args) {
		
		Book book = new Book("����", "�ڰ渮");
		
		// �ּ� ���
		System.out.println(book);
		
		// String Ŭ�������� toString �� ���ǵǾ� �ִ�.
		String str = new String("����");
		System.out.println(str);
		// toString -> Object �� �޼���, String Ŭ���� ���� ĳ���� �迭�� ����ϵ��� ������
		System.out.println(str.toString());
	}

}
