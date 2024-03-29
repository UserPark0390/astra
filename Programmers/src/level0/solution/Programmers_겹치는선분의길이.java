package level0.solution;

public class Programmers_겹치는선분의길이 {
	public static void main(String[] args) {
		// int[][] lines = { { -10, -1 }, { -2, 5 }, { 3, 9 } };
		// int[][] lines = { { 0, 5 }, { 3, 9 }, { 1, 10 } };
		// int[][] lines = {{0, 2}, {-3, -1}, {-2, 1}};
		int[][] lines = { { -10, 5 }, { -7, 3 }, { 0, 10 } };
		System.out.println(solution(lines));
	}

	public static int solution(int[][] lines) {
		int[] rail = new int[200];
		for (int[] line : lines) {
			for (int j = (line[0] + 100); j < (line[1] + 100); j++) {
				rail[j]++;
			}
		}

		int answer = 0;
		for (int value : rail) {
			if (value > 1)
				answer++;
		}
		return answer;

	}
}
