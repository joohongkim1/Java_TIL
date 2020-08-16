package collection;

import java.util.LinkedList;

public class LinkedListTest {
	
	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		// 해당 인덱스에 요소 추가
		myList.add(1, "Z");
		System.out.println(myList);
		// 마지막 요소 제거
		myList.removeLast();
		System.out.println(myList);
		
		for(int i = 0; i < myList.size(); i++) {
			String s = myList.get(i);
			System.out.println(s);
		}
	}
}
