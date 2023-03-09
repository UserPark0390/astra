package Broze;

import java.util.Scanner;

public class BackJoon10810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int N = sc.nextInt(); // 바구니 수 
		int M = sc.nextInt(); // 회차
		int [] A = new int [N]; 
		
		for(int i = 0; i < M; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int ball = sc.nextInt();
			int tmp = num2 - num1;
			
			A[num1-1] = ball;
			
			for(int j = 1; j <= tmp; j++) {
				A[num1-1+j] = ball;
			}
		}
		
		for(int i = 0; i< A.length; i++) {
			sb.append(A[i]).append(" ");
		}
		System.out.println(sb);
	}
}
