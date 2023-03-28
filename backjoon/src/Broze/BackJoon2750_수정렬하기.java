package Broze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon2750_수정렬하기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int A [] = new int [N];
		for(int i = 0; i < A.length; i++) {
			int num = Integer.parseInt(br.readLine());
			A[i] = num;
		}
		
		bubble_sort(A, A.length);

		for(int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
		br.close();
	}
	private static void bubble_sort(int [] A, int size) {
		for(int i = 1; i < size; i++) {
			for(int j = 0; j < size - i; j++) {
				if(A[j] > A[j+1]) {
					change(A, j, j+1);
				}
			}
		}
	}
	private static void change(int [] A, int i, int j) {
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
}
