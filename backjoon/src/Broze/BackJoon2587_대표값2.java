package Broze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon2587_대표값2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] A = new int [5];
		int avg = 0;
		
		for(int i = 0; i < A.length; i++) {
			int N = Integer.parseInt(br.readLine());
			A[i] = N;
			avg += N;
		}
		selection_sort(A, A.length);
		
		System.out.println(avg/5); // 평균값
		System.out.println(A[2]);  // 중앙값
		
	}
	
	private static void selection_sort(int [] A, int size) {
		for(int i = 0; i < size-1; i++) {
			int min = i;
			for(int j = i+1; j < size; j++) {
				if(A[j] < A[min]) {
					min = j;
				}
			}
			change(A, min, i);
		}
	}
	
	private static void change(int [] A, int i, int j) {
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
}
