package level1.level1_different;

public class Programmers_정수제곱근판별 {
	public static void main(String[] args) {
		long n = 10;
		System.out.println(solution(n));
	}

	public static long solution(long n) {
		if (Math.pow((int) Math.sqrt(n), 2) == n) {
			return (long) Math.pow(Math.sqrt(n) + 1, 2);
		}
		return -1;
	}
}
