package Broze;

import java.util.Scanner;

public class BackJoon10952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int result = 0;
		
		while (true) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			if (A == 0 && B == 0) {
//				System.exit(0);
				break;
			}
			result = A + B;
			System.out.println(A + B);
//			sb.append(result).append("\n");
		}
//		System.out.println(sb);
	}
}
