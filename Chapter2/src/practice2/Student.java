package practice2;

import java.util.ArrayList;

public class Student {
	
	int stuID;
	String stuName;
	ArrayList<Book> bookList;
	
	public Student(int stuID, String stuName) {
		this.stuID = stuID;
		this.stuName = stuName;
		
		bookList = new ArrayList<Book>();
	}
	
	public void addBook(String title) {
		Book book = new Book(title);
		bookList.add(book);
	}
	
	public void showStuInfo() {
		System.out.print(stuName + " �л��� ���� å�� : ");
		
		for(Book book: bookList) {
			System.out.print(book.getTitle() + " ");
		}
		System.out.println();
	}
}
