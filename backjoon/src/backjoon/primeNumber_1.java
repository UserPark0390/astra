package backjoon;

public class primeNumber_1 {
	public static void main(String[] args) throws Exception {
		// 구하고자 하는 숫자범위
		int N = 120;
		boolean prime[] = new boolean[121];

		// 소수는 false
		// 0과 1은 소수가 아니므로 제외
		prime[0] = prime[1] = true;

		for (int i = 2; i * i <= N; i++) {
			// prime[i]가 소수라면
			if (!prime[i]) {
				// prime[j] = 소수가 아닌 것을 표시
				for (int j = i * i; j <= N; j += i) {
					prime[j] = true;
				}
			}
		}
		// 소수 출력
		for (int i = 1; i <= N; i++) {
			if(!prime[i]) {
				System.out.print(i + " ");
			}
		}

	}
}
