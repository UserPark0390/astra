package level0;

import java.util.stream.IntStream;

public class Programmers_공던지기 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};
		int k = 3;
		System.out.println(solution(numbers, k));
	}

	public static int solution(int[] numbers, int k) {
		return IntStream.range(1, k).mapToObj(i -> numbers).flatMapToInt(IntStream::of).toArray()[2 * k - 2];
	}

}
