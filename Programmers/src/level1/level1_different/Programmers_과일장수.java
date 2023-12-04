package level1.level1_different;

import java.util.Arrays;

public class Programmers_과일장수 {
	public static void main(String[] args) {
		int k = 4;
		int m = 3;
		int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2 };
		System.out.println(solution(k, m, score));
	}

	public static int solution(int k, int m, int[] score) {
	       int answer = 0;

	        Arrays.sort(score);

	        for(int i = score.length; i >= m; i -= m){
	            answer += score[i - m] * m;
	        }

	        return answer;
	}
}
