package Broze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon10798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char A [][] = new char [5][15];
		int count = 0;
		
		for(int i = 0; i < 5; i++) {
			String arr = br.readLine();	
			for(int j = 0; j < arr.length(); j++) {
					A[i][j] = arr.charAt(j);
				if(count < arr.length()) {
					count = arr.length();
				}		
			}					
		}
		for(int i = 0; i < count; i++) {
			for(int j = 0; j < 5; j++) {
				if(A[j][i] == '\0') { //  '\0'과 null의 차이
					continue;
				}
				sb.append(A[j][i]);
			}
		}
		System.out.println(sb);
	}
}
