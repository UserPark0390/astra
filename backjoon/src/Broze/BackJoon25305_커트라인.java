package Broze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon25305_커트라인 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int A [] = new int [N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			A[i] = num;
		}
		selection_sort(A, A.length);
		System.out.println(A[k-1]);
	}
	private static void selection_sort(int [] A, int size) {
		for(int i = 0; i < size -1; i++) {
			int max = i; // 최대값
			for(int j = i+1; j< size; j++) {
				if(A[j] > A[max]) {
					max = j;
				}
			}
			change(A, max, i);
		}
	}
	
	private static void change(int [] A, int i, int j) {
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
}
