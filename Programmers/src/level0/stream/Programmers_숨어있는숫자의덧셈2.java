package level0.stream;

import java.util.Arrays;

public class Programmers_숨어있는숫자의덧셈2 {
	public static void main(String[] args) {
		String my_string = "1a2b3c4d123Z";
		System.out.println(solution(my_string));
	}

	public static int solution(String my_string) {
		 return Arrays.stream(my_string.split("[A-Z|a-z]")).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).sum();
	}
}
