package Broze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon24266_알고리즘수행시간5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long N = Long.parseLong(br.readLine());
		System.out.println(N*N*N);
		System.out.println(3);
			
//		MenOfPassion(A[], n) {
//		    sum <- 0;
//		    for i <- 1 to n
//		        for j <- 1 to n
//		            for k <- 1 to n
//		                sum <- sum + A[i] × A[j] × A[k]; # 코드1
//		    return sum;
//		}
// 		for 문을 3번 돌기 때문에 시간복잡도는 O(n^3)
	}
}
