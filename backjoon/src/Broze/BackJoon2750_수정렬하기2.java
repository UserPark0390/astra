package Broze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon2750_수정렬하기2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int A [] = new int [N];
		
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < N-1; i++) {
			for(int j = 0; j < N-1-i; j++) {
				if(A[j] > A[j+1]) {
					int tmp = A[j];
					A[j] = A[j+1];
					A[j+1] = tmp;
				}
			}
		}
		for(int i = 0; i < N; i++) {
			System.out.println(A[i]);
		}
	}
}
