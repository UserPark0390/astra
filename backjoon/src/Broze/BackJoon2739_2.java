package Broze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BackJoon2739_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken()); // 행렬의 크기 N 과 M		
		int M = Integer.parseInt(st.nextToken());
		int[][] A = new int[N][M]; // N개의 줄에 행렬 A의 원소 M개
		int[][] B = new int[N][M]; // N개의 줄에 행렬 B의 원소 M개

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()+ " ");
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		} // A for end

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				B[i][j] = Integer.parseInt(st.nextToken());
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
