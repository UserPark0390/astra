package level0.stream;

import java.util.Arrays;

public class Programmers_머쓱이보다키큰사람 {
	public static void main(String[] args) {
		int[] array = { 149, 180, 192, 170 };
		int height = 167;
		System.out.println(solution(array, height));
	}

	public static int solution(int[] array, int height) {
		return (int) Arrays.stream(array).filter(value -> value > height).count();
	}
}
