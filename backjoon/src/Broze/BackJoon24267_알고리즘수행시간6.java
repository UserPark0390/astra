package Broze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon24267_알고리즘수행시간6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long N = Long.parseLong(br.readLine());
		
		int sum = 0;
		int count = 0;
		
		for(int i = 1; i <= N-2; i++) {
			for(int j = i+1; j <= N-1; j++) {
				for(int k = j+1; k <= N; k++) {
					sum = sum + i * j * k;
					count++;
				}
			}
		}
		System.out.println(count);
		System.out.println(N*(N-1)*(N-2));
		System.out.println(N*(N-1)*(N-2)/6);
		System.out.println(3);
		
//		MenOfPassion(A[], n) {
//		    sum <- 0;
//		    for i <- 1 to n - 2
//		        for j <- i + 1 to n - 1
//		            for k <- j + 1 to n
//		                sum <- sum + A[i] × A[j] × A[k]; # 코드1
//		    return sum;
//		}
		// for 문 3회 범위(n, n-1, n-2)
		// 
	}
}
