package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c1 = String.class;
		
		String str = new String();
		Class c2 = str.getClass();
		
		Class c3 = Class.forName("java.lang.String");
		
		// reflection 프로그래밍 : 로컬에 객체가 없고 자료형을 알 수 없는 경우
		Constructor[] cons = c3.getConstructors();
		for(Constructor con: cons) {
			System.out.println(con);
		}
		
		System.out.println();
		
		Method[] methods = c3.getMethods();
		for(Method method: methods) {
			System.out.println(method);
		}
		
		
	}
	

}
