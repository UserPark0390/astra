package level0;

import java.util.Arrays;

public class Programmers_최빈값구하기 {
	public static int solution(int[] array) {
		Arrays.sort(array);
		int answer = 0;
		int max = 0;
		int maxNum = array[0];
		int count = 1;

		for (int i = 1; i < array.length; i++) {
			if (array[i] == array[i - 1]) {
				count++;
				if (count > max) {
					max = count;
					maxNum = array[i];
				} else if (count == max) {
					maxNum = -1;
				}
			} else {
				count = 1;
			}
			if (count == 1) {
				answer = -1;
			}
		}
		if(max > 0 || array.length == 1) {
			answer = maxNum;
		} 

		return answer;
	}

	public static void main(String[] args) {
		int[] array = {1};

		System.out.println(solution(array));
	}
}
