package treeset;

import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("A");
		treeSet.add("B");
		treeSet.add("C");
		
		// String 에 Comparable 인터페이스가 구현이 이미 되어있다.(오름차순)
		for(String str: treeSet) {
			System.out.println(str);
		}
	}
}
