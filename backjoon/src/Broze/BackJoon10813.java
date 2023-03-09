package Broze;

import java.util.Scanner;

public class BackJoon10813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int N = sc.nextInt(); // 바구니 수 
		int M = sc.nextInt(); // 회차
		int [] A = new int [N];
		int tmp = 0;
		
		for(int i = 0; i < N; i++) {
			A[i] = i+1; 
		}
		
		for(int i = 0; i< M; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			tmp = A[num1-1];
			A[num1-1] = A[num2-1];
			A[num2-1] = tmp;
		}
		for(int i = 0; i < N; i++) {
			sb.append(A[i]).append(" "); 
		}
		System.out.println(sb);
	}
}

