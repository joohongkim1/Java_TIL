package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length)
			return s1;
		
		else
			return s2;
	}
	
}

public class ReduceTest {
	
	public static void main(String[] args) {
		
		String[] greetings = {"hello", "hi", "¾È³çÇÏ¼¼¿ä"};
		String result = Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if(s1.getBytes().length >= s2.getBytes().length)
				return s1;
			
			else
				return s2;
		});
		
		System.out.println(result);
		
		String result2 = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(result2);
	}
}
