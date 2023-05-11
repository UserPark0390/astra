package level0.solution;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers_평행 {
	public static void main(String[] args) {
		int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
		System.out.println(solution(dots));
	}
	
    public static int solution(int[][] dots) {
        int answer = 0;
        Arrays.sort(dots, Comparator.comparing((int[] o)-> o[0]));
        int A = Math.abs(dots[0][0] - dots[1][0]);
        int B = Math.abs(dots[0][1] - dots[1][1]);
        int C = Math.abs(dots[2][0] - dots[3][0]);
        int D = Math.abs(dots[2][1] - dots[3][1]);
        if(A-B == C-D) {
        	answer = 1;
        } else {
        	answer = 0;
        }
        
        return answer;
    }
}
