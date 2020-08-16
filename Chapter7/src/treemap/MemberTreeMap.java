package treemap;

import java.util.TreeMap;
import java.util.Iterator;

public class MemberTreeMap {
	
	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if ( treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println("회원 번호가 없습니다.");
		return false;
	}
	
	public void showAllMember() {
		// 모든 key 객체를 반환, set 타입 반환
		Iterator<Integer> ir = treeMap.keySet().iterator();
		// value 반환, 중복될 수 있기 때문에 collection 타입 반환
		// treeMap.values().iterator();
		while( ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		
		System.out.println();
;	}
}
