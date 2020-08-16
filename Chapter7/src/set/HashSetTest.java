package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("�̼���");
		set.add("������");
		set.add("������");
		set.add("�̼���");
		
		// ������� ��µ��� �ʰ�, ���� �ߺ��� ������� �ʴ´�.
		System.out.println(set);
		
		// �ϳ��� ����� ��
		Iterator<String> ir = set.iterator();
		
		// hasNext() -> ���� element �� ������
		while(ir.hasNext()) {
			// ���� ��Ҹ� ��ȯ
			String str = ir.next();
			System.out.println(str);
		}
	}
}
