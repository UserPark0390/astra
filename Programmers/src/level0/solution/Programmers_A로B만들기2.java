package level0.solution;

public class Programmers_A로B만들기2 {
	public static void main(String[] args) {
		String before = "allpe";
		String after = "apple";
		System.out.println(solution(before, after));
	}

	public static int solution(String before, String after) {
		int answer = 0;
		int A = 0;
		int B = 0;
		for (int i = 0; i < before.length(); i++) {
			A += before.charAt(i);
			B += after.charAt(i);
		}
		if (A == B) {
			answer = 1;
		} else {
			answer = 0;
		}
		return answer;
	}
}
