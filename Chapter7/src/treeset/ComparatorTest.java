package treeset;

import java.util.Comparator;
import java.util.TreeSet;

// �̹� String �� Comparable �� ������ �Ǿ� �ֱ� ������
// Comparator �� ���ο� ���� ����� ������ �� �ִ�.
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
