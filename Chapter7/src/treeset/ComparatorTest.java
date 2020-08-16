package treeset;

import java.util.Comparator;
import java.util.TreeSet;

// 이미 String 에 Comparable 이 구현이 되어 있기 때문에
// Comparator 로 새로운 정렬 방식을 정의할 수 있다.
class MyCompare implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2) * (-1);
	}
	
}

public class ComparatorTest {
	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());
		
		treeSet.add("A");
		treeSet.add("B");
		treeSet.add("C");
		
		for(String str: treeSet) {
			System.out.println(str);
		}
	}
}
