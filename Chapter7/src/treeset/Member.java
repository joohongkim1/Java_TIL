package treeset;

import java.util.Comparator;

public class Member implements Comparator<Member> {

	private int memberId;
	private String memberName;
	
	public Member() {}
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + " 회원님의 ID는 " + memberId;
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Member) {
			Member member = (Member)obj;
			return this.memberId == member.memberId;
		}
		
		return false;
	}
	
// implements Comparable<Member> 의 경우
//	@Override
//	public int compareTo(Member member) {
		
		// 양수를 반환하게 되면 오름차순 정렬
		// 반대는 * (-1) 또는 연산 뒤집으면 됨
//		return (this.memberId - member.memberId);
		// string 순 정렬
//		return this.memberName.compareTo(member.getMemberName());
//	}
	
	@Override
	// 첫번쨰 member 가 this, 두번째가 넘어온 매개변수
	public int compare(Member member1, Member member2) {
		
		return (member1.memberId - member2.memberId);
	}
	
	
}
