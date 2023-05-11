package level0.solution;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers_겹치는선분의길이 {
	public static void main(String[] args) {
		 //int[][] lines = { { -10, -1 }, { -2, 5 }, { 3, 9 } };
		//int[][] lines = { { 0, 5 }, { 3, 9 }, { 1, 10 } };
		 int[][] lines = {{0, 2}, {-3, -1}, {-2, 1}};
		System.out.println(solution(lines));
	}

	public static int solution(int[][] lines) {		
		int answer = 0;
		Arrays.sort(lines, Comparator.comparing((int[] o) -> o[0]));
		for (int i = 0; i < lines.length; i++) {
			if (i == lines.length-1) {
				if (lines[0][1] >= lines[i][0]) {
					answer -= lines[0][1] - lines[i][0];
				}
			} else {
				if (lines[i][0] <= lines[i + 1][0] && lines[i][1] > lines[i + 1][0]) {
					if(lines[i+1][0] > lines[i][0] && lines[i+1][1] > lines[i][1]) {
						answer += lines[i][1] - lines[i+1][0];							
					} else {
						answer += lines[i+1][1] - lines[i+1][0];	
					}					
				}
			}
		}

		return answer;
	}
}
