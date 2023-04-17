package level0.stream;

import java.util.stream.IntStream;

public class Programmers_순서쌍의개수 {

	public static void main(String[] args) {
		int n = 100;
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
	}

}
