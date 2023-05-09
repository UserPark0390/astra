package level0.different;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers_직사각형넓이구하기 {
	public static void main(String[] args) {
		int[][] dots = { { 0, 1 }, { 1, 1 }, { 1, 0 }, { 0, 0 } };
		System.out.println(solution(dots));
	}

	public static int solution(int[][] dots) {
		 Arrays.sort(dots,Comparator.comparing((int[] it)-> it[0]).thenComparing((int[] it)->it[1]));
	        return (dots[3][0] - dots[0][0]) * (dots[3][1] - dots[0][1]);
	}

}
