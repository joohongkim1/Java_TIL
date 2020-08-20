package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	
	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		sList.add("Lee");
		sList.add("Kim");
		sList.add("Park");
		
		// �÷����� ��� stream �޼��� ���
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		// �ٽ� ���� �����ؼ� �ؾ���.
		// String �� Comparable �Ǿ��ֱ� ������ sorted ����
		// �� �Ǿ� ������ ���� �ۼ��������
		sList.stream().sorted().forEach(s -> System.out.println(s));
		System.out.println();
		              // �߰� ����                            // ���� ����
		sList.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
		
	}
}
