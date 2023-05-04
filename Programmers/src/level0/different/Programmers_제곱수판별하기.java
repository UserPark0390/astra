package level0.different;

public class Programmers_제곱수판별하기 {
	public static void main(String[] args) {
		int n = 144;
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		 return Math.sqrt(n) % 1 == 0 ? 1 : 2;
	}

}
