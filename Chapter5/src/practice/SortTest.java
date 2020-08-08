package practice;

import java.io.IOException;
import java.util.ArrayList;

public class SortTest {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("정렬방식을 선택하세요. (대문자 입력)");
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
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
		
	}
}
