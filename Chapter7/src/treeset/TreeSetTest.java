package treeset;

import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("A");
		treeSet.add("B");
		treeSet.add("C");
		
		// String �� Comparable �������̽��� ������ �̹� �Ǿ��ִ�.(��������)
		for(String str: treeSet) {
			System.out.println(str);
		}
	}
}
