package level0.stream;

import java.util.Arrays;

public class Programmers_최대값만들기2 {
	public static void main(String[] args) {
		int[] numbers = { -1, 1 };
		System.out.println(solution(numbers));
	}

	public static int solution(int[] numbers) {
		Arrays.sort(numbers);
		return Math.max(numbers[0] * numbers[1], numbers[numbers.length - 1] * numbers[numbers.length - 2]);
	}

}
