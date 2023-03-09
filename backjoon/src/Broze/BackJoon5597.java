package Broze;

import java.util.Scanner;

public class BackJoon5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int A [] = new int [30];
		int number = 28;
		
		for(int i = 0; i < A.length; i++) {
			A[i] = i+1;
		}
		
		while(number-- > 0) {
			int Student = sc.nextInt();
			A[Student-1] = 0;			
		}
		
		for(int i = 0; i < A.length; i++) {
			if(A[i] != 0) {
				sb.append(A[i]).append("\n");
			}
		}		
		System.out.println(sb);
	}
}
