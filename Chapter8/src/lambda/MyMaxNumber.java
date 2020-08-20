package lambda;

// 함수형 인터페이스의 경우 메서드 2개 이상 선언 불가능
@FunctionalInterface
public interface MyMaxNumber {
	int getMaxNum(int x, int y);
}
