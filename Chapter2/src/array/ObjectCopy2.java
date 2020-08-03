package array;

public class ObjectCopy2 {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copy = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		copy[0] = new Book();
		copy[1] = new Book();
		copy[2] = new Book();
		copy[3] = new Book();
		copy[4] = new Book();
		
		// 깊은 복사 -> 원본을 바꿔도 카피본에 영향을 미치지 않는다.
		// 각각 다른 인스턴스
		for(int i=0; i < copy.length; i++) {
			copy[i].setAuthor(library[i].getAuthor());
			copy[i].setTitle(library[i].getTitle());
		}
		
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("===============================");
		
		for(Book book : copy) {
			book.showBookInfo();
		}
	}
}
