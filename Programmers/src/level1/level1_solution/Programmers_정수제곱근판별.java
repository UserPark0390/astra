package level1.level1_solution;

public class Programmers_정수제곱근판별 {
	public static void main(String[] args) {
		long n = 10;
		System.out.println(solution(n));
	}

	public static long solution(long n) {
		long answer = 0;
		long targetNumber = (long)Math.sqrt(n);
		answer = (long)Math.pow(targetNumber,2) == n ? (long) Math.pow(targetNumber+1,2) : -1;		
		return answer;
	}
}
