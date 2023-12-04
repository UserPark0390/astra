package level1.level1_different;

public class Programmers_정수제곱근판별2 {
	public static void main(String[] args) {
		long n = 10;
		System.out.println(solution(n));
	}

	public static long solution(long n) {
		double i = Math.sqrt(n);

		return Math.floor(i) == i ? (long) Math.pow(i + 1, 2) : -1;
	}
}
