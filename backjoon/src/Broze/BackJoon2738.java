package Broze;

import java.util.Scanner;

public class BackJoon2738 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt(); // 행렬의 크기 N 과 M
		int M = sc.nextInt();
		int[][] A = new int[N][M]; // N개의 줄에 행렬 A의 원소 M개
		int[][] B = new int[N][M]; // N개의 줄에 행렬 B의 원소 M개

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
			}
		} // A for end

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				B[i][j] = sc.nextInt();
			}
		} // B for end

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				sb.append(A[i][j] + B[i][j] + " "); 
				if (j == M-1) { // 행이 끝나면 다음 열로 내리기
					sb.append(System.lineSeparator());
				}
			}
		} // A + B end

		System.out.println(sb);

	}
}
