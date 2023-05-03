package level0.different;

public class Programmers_숫자찾기 {
	public static void main(String[] args) {
		int num = 123456;
		int k = 7;
		System.out.println(solution(num, k));
	}

	public static int solution(int num, int k) {
		return ("-" + num).indexOf(String.valueOf(k));
	}
}
