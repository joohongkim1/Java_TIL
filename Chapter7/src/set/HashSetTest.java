package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("이순신");
		set.add("김유신");
		set.add("강감찬");
		set.add("이순신");
		
		// 순서대로 출력되지 않고, 값의 중복을 허용하지 않는다.
		System.out.println(set);
		
		// 하나씩 출력할 떄
		Iterator<String> ir = set.iterator();
		
		// hasNext() -> 다음 element 가 있으면
		while(ir.hasNext()) {
			// 다음 요소를 반환
			String str = ir.next();
			System.out.println(str);
		}
	}
}
