package Broze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon24265_알고리즘수행시간4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long N = Long.parseLong(br.readLine());
		System.out.println(N*(N-1)/2);
		System.out.println(2);

//		MenOfPassion(A[], n) {
//		    sum <- 0;
//		    for i <- 1 to n - 1
//		        for j <- i + 1 to n
//		            sum <- sum + A[i] × A[j]; # 코드1
//		    return sum;
//		}
		// i는 [1, n-1], j는 [i+1, n]번 돈다
		// n-1 + n+2 + ... + 1번 돌게된다.
		// 차가 1인 등차수열만큼 돌게 되므로 n*(n-1)/2 만큼 돈다
		// 그래도 시간 복잡도는 똑같이 O(n^2) -> 차수는 2
	}
}
