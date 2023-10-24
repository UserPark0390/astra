package level0.stream;

import java.util.stream.IntStream;

public class Programmers_길이에따른연산 {

	public static int solution(int[] num_list) {
		IntStream stream = IntStream.of(num_list);
		return num_list.length > 10 ? stream.sum() : stream.reduce(1, (a, b) -> a * b);
	}
	public static void main(String[] args) {
		int[] num_list = { 2, 3, 4, 5 };
		System.out.println(solution(num_list));
	}
}