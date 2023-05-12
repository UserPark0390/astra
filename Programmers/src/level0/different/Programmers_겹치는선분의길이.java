package level0.different;

import java.util.Map;
import java.util.HashMap;

public class Programmers_겹치는선분의길이 {
	public static void main(String[] args) {
		// int[][] lines = { { -10, -1 }, { -2, 5 }, { 3, 9 } };
		// int[][] lines = { { 0, 5 }, { 3, 9 }, { 1, 10 } };
		// int[][] lines = {{0, 2}, {-3, -1}, {-2, 1}};
		int[][] lines = { { -10, 5 }, { -7, 3 }, { 0, 10 } };
		System.out.println(solution(lines));
	}

	public static int solution(int[][] lines) {
	       Map<Integer, Integer> map = new HashMap<>();

	        for (int i=0; i<lines.length; i++) {
	            int min = Math.min(lines[i][0], lines[i][1]);
	            int max = Math.max(lines[i][0], lines[i][1]);

	            for (int j=min; j<max; j++) {
	                map.put(j, map.getOrDefault(j, 0) + 1);
	            }
	        }

	        int answer = 0;

	        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            if (entry.getValue() >= 2) {
	                answer++;
	            }
	        }

	        return answer;

	}
}
