package level1.level1_stream;

import java.util.Arrays;

public class Programmers_평균구하기 {
	public static void main(String[] args) {
		int[] arr = { 5, 5 };
		System.out.println(solution(arr));
	}

	public static double solution(int[] arr) {
		return Arrays.stream(arr).average().getAsDouble();
	}
}
