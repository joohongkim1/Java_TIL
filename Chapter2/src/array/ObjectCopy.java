package array;

public class ObjectCopy {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copy = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		System.arraycopy(library, 0, copy, 0, 5);
		
//		항샹된 for문
//		for( Book book : copy) {
//			book.showBookInfo();
//		}
		
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("===============================");
		
		// 얕은 복사로 인해 library 에서 바뀐 값이 적용된다.
		// 얕은 복사 -> 주소만 복사하는 것(같은 주소를 가리킨다.)
		for(Book book : copy) {
			book.showBookInfo();
		}
	}
}
