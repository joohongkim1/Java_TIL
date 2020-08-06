package template_use;

public class Beginner extends PlayerLevel{
	
	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}
	
	@Override
	public void jump() {
		System.out.println("Jump 안 배움");
	}

	@Override
	public void turn() {
		System.out.println("Turn 안 배움");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("======초보자 레벨======");
	}

	
}
