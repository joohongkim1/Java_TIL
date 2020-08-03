package array;

public class ObjectCopy2 {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copy = new Book[5];
		
		library[0] = new Book("�¹���1", "������");
		library[1] = new Book("�¹���2", "������");
		library[2] = new Book("�¹���3", "������");
		library[3] = new Book("�¹���4", "������");
		library[4] = new Book("�¹���5", "������");
		
		copy[0] = new Book();
		copy[1] = new Book();
		copy[2] = new Book();
		copy[3] = new Book();
		copy[4] = new Book();
		
		// ���� ���� -> ������ �ٲ㵵 ī�Ǻ��� ������ ��ġ�� �ʴ´�.
		// ���� �ٸ� �ν��Ͻ�
		for(int i=0; i < copy.length; i++) {
			copy[i].setAuthor(library[i].getAuthor());
			copy[i].setTitle(library[i].getTitle());
		}
		
		library[0].setTitle("����");
		library[0].setAuthor("�ڿϼ�");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("===============================");
		
		for(Book book : copy) {
			book.showBookInfo();
		}
	}
}
