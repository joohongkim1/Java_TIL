package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// <> 제너릭 -> 타입 지정, 안 할 경우 형변환 해줘야함. 나중에 자세히 배움.
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		// size 와 length 의 차이 -> size 는 element 의 갯수만큼, length 는 배열의 총 길이
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
