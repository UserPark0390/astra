package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BackJoon1940_주몽_sol {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int A[] = new int[N];
		int start_index = 0; // A[0]
		int end_index = N-1; // A[N-1]
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		
		while(start_index < end_index) {
			if(A[start_index] + A[end_index] < M) {
				start_index++;
			} else if(A[start_index] + A[end_index] > M) {
				end_index--;
			} else {
				count++;
				start_index++;
				end_index--;
			}
		}
		System.out.println(count);
		
	}
}
