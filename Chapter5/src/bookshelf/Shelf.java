package bookshelf;

import java.util.ArrayList;

public class Shelf {
	
	// ���� Ŭ�������� ����ϵ��� protected Ű����� ����
	protected ArrayList<String> shelf;
	
	// ArrayList ������ �ַ� �����ڿ��� ���� ��.
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