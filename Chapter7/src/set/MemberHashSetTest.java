package set;

public class MemberHashSetTest {
	
	public static void main(String[] args) {
		
		MemberHashSet manager = new MemberHashSet();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark = new Member(300, "Park");
		Member memberPark2 = new Member(300, "Park2");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		// String 의 경우 JDK 에 구현되어 있지만
		// Id 는 같다고 해서 같은 멤버라는 것이 논리적으로 구현되어 있지 않다.
		// 직접 구현해야 한다. Member 클래스에서 equals() 와 hashCode() 로 재정의
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
		
		manager.showAllMember();
		
		manager.removeMember(100);
		manager.showAllMember();
	}
}
