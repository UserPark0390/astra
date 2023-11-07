package level1.level1_different;

public class Programmers_3진법뒤집기 {
	public static void main(String[] args) {
		int n = 100000000;
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		String a = "";

		while (n > 0) {
			a = (n % 3) + a;
			n /= 3;
		}
		a = new StringBuilder(a).reverse().toString();

		return Integer.parseInt(a, 3);
	}
}
