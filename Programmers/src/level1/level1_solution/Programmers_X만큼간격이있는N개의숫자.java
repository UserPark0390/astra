package level1.level1_solution;

import java.util.Arrays;

public class Programmers_X만큼간격이있는N개의숫자 {
	public static void main(String[] args) {
		int x = -4;
		int n = 5;
		System.out.println(Arrays.toString(solution(x, n)));
	}

	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				answer[i] = (long) x;
			} else {
				answer[i] = (long) answer[i-1] + x;
			}
		}
		return answer;
	}
}
