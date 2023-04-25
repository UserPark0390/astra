package level0.solution;

import java.util.Arrays;

public class Programmers_진료순서정하기 {

	public static void main(String[] args) {
		int[] emergency = {30, 10, 23, 6, 100};
		System.out.println(Arrays.toString(solution(emergency)));
	}

	public static int[] solution(int[] emergency) {
		int[] answer = new int[emergency.length];
		for (int i = 0; i < emergency.length; i++) {
			int check = emergency.length; // 응급도 체크
			int num = emergency[i];
			for (int j = 0; j < emergency.length; j++) { // 전체 탐색
				if(num > emergency[j]) {
					check--;
				}				
			}
			answer[i] = check;
		}
		return answer;
	}
}
