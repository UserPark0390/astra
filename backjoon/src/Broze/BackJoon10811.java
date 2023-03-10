package Broze;

import java.util.Scanner;

public class BackJoon10811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A [] = new int [N];
		int tmp = 0;
		
		
		for(int i = 0; i< N; i++) {
			A[i] = i+1;
		}
		
		for(int i = 0; i < M; i++) {
			int I = sc.nextInt()-1;
			int J = sc.nextInt()-1;
			
			for(int j = I; j <= (J-I)/2+I; j++) {
				tmp = A[j];
				A[j] = A[J-j+I];
				A[J-j+I] = tmp;
				
			}
		}
		
		for(int i = 0; i < N; i++) {
			 sb.append(A[i]).append(" ");
		}
		System.out.println(sb);
	}
}
