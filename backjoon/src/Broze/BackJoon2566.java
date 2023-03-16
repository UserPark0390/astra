package Broze;

import java.util.Scanner;

public class BackJoon2566 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int A [][] = new int [9][9];
		int target = 0;
		int target_i = 0;
		int target_j = 0;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				A[i][j] = sc.nextInt();
				if(A[i][j] > target) {
					target = A[i][j];
					target_i = i;
					target_j = j;
				}
			}
		}
		sb.append(target).append("\n").append(target_i+1).append(" ").append(target_j+1);
		System.out.println(sb);
	}
}
