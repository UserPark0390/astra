package Broze;

import java.util.Scanner;

public class BackJoon2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A [] = new int [9];
		int max = 0;
		int count = 0;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 9; i++) {
			int tmp = sc.nextInt();
			A[i] = tmp;
			if(A[0] == A[i]) {
				max = A[i];
				count = i+1;
			} else if(tmp > max) {
				max = A[i];
				count = i+1;
			}
		} // end
		sb.append(max).append("\n").append(count);
		System.out.println(sb);
	}
}
