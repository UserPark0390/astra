package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon1940_주몽_my {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int A[] = new int[N];
		int result = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N;j++) {
				int sum = 0;
				sum = A[i] + A[j];
				if(sum == M) {
					result++;
					break;
				}
			}
		}
		System.out.println(result);
		
	}
}
