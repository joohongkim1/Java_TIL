package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// <> ���ʸ� -> Ÿ�� ����, �� �� ��� ����ȯ �������. ���߿� �ڼ��� ���.
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		// size �� length �� ���� -> size �� element �� ������ŭ, length �� �迭�� �� ����
		System.out.println(list.size());
		
		for(int i=0; i <list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
			System.out.println(list.get(i));
		}
		System.out.println("====================");
		for(String s: list) {
			System.out.println(s);
		}
	}

}
