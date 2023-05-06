package level0.different;

import java.util.Arrays;

public class Programmers_최대값만들기2 {
	public static void main(String[] args) {
		int[] numbers = { -1, 1 };
		System.out.println(solution(numbers));
	}

	public static int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
	}

}
