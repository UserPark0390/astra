package level0.solution;

public class Programmers_저주의숫자3 {
	public static void main(String[] args) {
		int n = 100;
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			answer = answer + 1;
			answer = check(answer);
		}
		return answer;
	}

	private static int check(int answer) {
		while (answer % 3 == 0 || answer % 10 == 3 || answer / 10 == 3 || answer / 10 == 13) {
			answer = answer + 1;
		}
		return answer;
	}
}
