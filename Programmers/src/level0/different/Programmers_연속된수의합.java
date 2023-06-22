package level0.different;

import java.util.Arrays;

public class Programmers_연속된수의합 {
	public static void main(String[] args) {
		int num = 5;
		int total = 5;
		System.out.println(Arrays.toString(solution(num, total)));
	}

	public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        int check = num*(num+1) / 2;
        int start = (total - check) / num + 1;
        for (int i = 0; i < answer.length; i++) {
                answer[i] = start + i ;
        }
        return answer;
	}
}
