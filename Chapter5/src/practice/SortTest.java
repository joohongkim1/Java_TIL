package practice;

import java.io.IOException;
import java.util.ArrayList;

public class SortTest {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("���Ĺ���� �����ϼ���. (�빮�� �Է�)");
		System.out.println("B : BubbleSort");
		System.out.println("H : HeapSort");
		System.out.println("Q : QuickSort");
		
		Sort sort = null;
		int sc = System.in.read();
		
		if ( sc == 'B' ) {
			sort = new BubbleSort();
		} else if ( sc == 'H' ) {
			sort = new HeapSort();
		} else if (sc == 'Q' ) {
			sort = new QuickSort();
		} else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
		
	}
}
