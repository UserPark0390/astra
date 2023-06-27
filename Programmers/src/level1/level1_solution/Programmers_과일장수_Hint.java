package level1.level1_solution;

import java.util.Arrays;

public class Programmers_과일장수_Hint {
	public static void main(String[] args) {
		int k = 4;
		int m = 3;
		int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2 };
		System.out.println(solution(k, m, score));
	}

	public static int solution(int k, int m, int[] score) {
		int answer = 0;
		Arrays.sort(score);
		int box_Length = score.length / m;
		int [] box = new int[box_Length];
		int count = 0;
		int min = 10;
		
		for(int i = score.length-1; i >= m-1; i -= m) {
			for(int j = i; j > i - m; j--) {
				min = Math.min(min, score[j]);
			}
			box[count++] = min * m;
		}
		
		answer = Arrays.stream(box).sum();


		return answer;
	}
}
