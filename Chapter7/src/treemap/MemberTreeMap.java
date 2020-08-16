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
		System.out.println("ȸ�� ��ȣ�� �����ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		// ��� key ��ü�� ��ȯ, set Ÿ�� ��ȯ
		Iterator<Integer> ir = treeMap.keySet().iterator();
		// value ��ȯ, �ߺ��� �� �ֱ� ������ collection Ÿ�� ��ȯ
		// treeMap.values().iterator();
		while( ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		
		System.out.println();
;	}
}
