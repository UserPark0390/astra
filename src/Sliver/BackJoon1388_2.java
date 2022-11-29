package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//import java.util.Scanner;
import java.util.StringTokenizer;

public class BackJoon1388_2 {	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int result = 0;
		char [][] A = new char [N][M];
		
		for(int i =0; i < N; i++) {
			A[i] = br.readLine().toCharArray();
			for(int j =0; j < M; j++) {
					if(A[i][j] == '-') {
						result++;
						while(j < M && A[i][j] == '-') {
							j++;
						}
					}
			}
		}
		
		for(int i =0; i < M; i++) {
			for(int j =0; j < N; j++) {
					if(A[j][i] == '|') {
						result++;
						while(j < N && A[j][i] == '|') {
							j++;
						}
					}
			}
		}
		System.out.println(result);
		
	} // main end
	
}
