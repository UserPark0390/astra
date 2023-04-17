package level0.stream;

import java.util.stream.Collectors;

public class Programmers_외계행성나이 {

	public static void main(String[] args) {
		int age = 100;
		System.out.println(solution(age));
	}

	public static String solution(int age) {
		 return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
	}
}
