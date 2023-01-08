package Broze;

import java.util.Scanner;

public class BackJoon10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int A[] = new int[N];
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			if (A[i] < X) {
				sb.append(A[i]).append(" ");
			}
		}
		System.out.println(sb);

	}
}
