package level1.level1_different;

import java.util.Arrays;

public class Programmers_X만큼간격이있는N개의숫자 {
	public static void main(String[] args) {
		int x = -4;
		int n = 5;
		System.out.println(Arrays.toString(solution(x, n)));
	}

	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		answer[0] = x;

		for (int i = 1; i < n; i++) {
			answer[i] = answer[i - 1] + x;
		}

		return answer;
	}
}
