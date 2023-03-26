package backjoon;

import java.util.Scanner;

public class primeNumber_2 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		// 구하고자 하는 숫자범위
		int N = sc.nextInt();
		boolean prime[] = new boolean[N+1];

		// 소수는 false
		// 0과 1은 소수가 아니므로 제외 (그래서 true로 넣어줌)
		prime[0] = prime[1] = true;

		for (int i = 2; i * i <= N; i++) { // 2부터 N사이에 i*i(i의 제곱)
			// prime[i]가 소수라면 if문을 타고 
			if (!prime[i]) {
				// prime[j] = 소수가 아닌 것을 표시 
				for (int j = i * i; j <= N; j += i) {
					// i*i = j이면서 for문을 돌 때 i의 수만큼 증가해서 true로 변환
					prime[j] = true;
				}
			}
		}
		// 소수 출력
		for (int i = 1; i <= N; i++) {
			if(!prime[i]) {
				sb.append(i).append(" ");
			}
		}
		System.out.println(sb);
	}
}
