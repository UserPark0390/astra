package level0.solution;

import java.util.Arrays;

public class Programmers_연속된수의합 {
	public static void main(String[] args) {
		int num = 5;
		int total = 5;
		System.out.println(Arrays.toString(solution(num, total)));
	}

	public static int[] solution(int num, int total) {
		int[] answer = new int[num];
		int tmp = total / num;
		int holjak = num % 2; 
		int number = -(num/2);
		if (holjak == 0) { 
			number++;
			for (int i = 0; i < num; i++) {
				answer[i] = tmp+number;
				number++;
			}
		} else { 
			for (int j = 0; j < num; j++) {
				answer[j] = tmp+number;
				number++;
			}
		}
		return answer;
	}
}
