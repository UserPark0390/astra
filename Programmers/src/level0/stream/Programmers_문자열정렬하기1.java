package level0.stream;

import java.util.Arrays;

public class Programmers_문자열정렬하기1 {
	public static void main(String[] args) {
		String my_string = "p2o4i8gj2";
		System.out.println(Arrays.toString(solution(my_string)));
	}

	public static int[] solution(String my_string) {
		return Arrays.stream(my_string.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt)
				.toArray();
	}
}
