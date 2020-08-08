package bookshelf;

import java.util.ArrayList;

public class Shelf {
	
	// 하위 클래스에서 사용하도록 protected 키워드로 선언
	protected ArrayList<String> shelf;
	
	// ArrayList 생성은 주로 생성자에서 많이 함.
	public Shelf() {
		shelf = new ArrayList<String>();
	}

	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
	
}
