package level1.level1_different;

import java.util.Arrays;

public class Programmers_서울에서김서방찾기 {
	public static void main(String[] args) {
		String[] seoul = { "Jane", "Kim" };
		System.out.println(solution(seoul));
	}

	public static String solution(String[] seoul) {
		int x = Arrays.asList(seoul).indexOf("Kim");
		return "김서방은 " + x + "에 있다";
	}
}
