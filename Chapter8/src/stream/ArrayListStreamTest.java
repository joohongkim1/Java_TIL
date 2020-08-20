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
		
		// 컬렉션의 경우 stream 메서드 사용
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		// 다시 새로 선언해서 해야함.
		// String 은 Comparable 되어있기 때문에 sorted 가능
		// 안 되어 있으면 직접 작성해줘야함
		sList.stream().sorted().forEach(s -> System.out.println(s));
		System.out.println();
		              // 중간 연산                            // 최종 연산
		sList.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
		
	}
}
