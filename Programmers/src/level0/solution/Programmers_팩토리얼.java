package level0.solution;

public class Programmers_팩토리얼 {

	public static void main(String[] args) {
		int n = 3628800;
		System.out.println(solution(n));

	}

	public static int solution(int n) {
		int tmp = 1;
		int answer = 0;
		for (int i = 1; i <= 10; i++) {
			tmp = tmp * i;
			if (tmp > n) {
				answer = i-1;
				break;
			} else if(tmp == n) {
				answer = i;
			}
		}

		return answer;
	}

}
