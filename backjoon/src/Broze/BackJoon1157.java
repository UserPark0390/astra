package Broze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BackJoon1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int A [] = new int [26];
		int max = -1 ;
		char result = ' ';
		
		for(int i = 0; i < str.length(); i++) {
			if(65 <= str.charAt(i) && str.charAt(i) <= 90) {
				A[str.charAt(i) - 65]++;
			} else {
				A[str.charAt(i) - 97]++; 
			}
		}
		
		for(int i = 0; i < A.length; i++) {
			if(A[i] > max) {
				max = A[i];
				result = (char)(i+65);
			} else if(A[i] == max) {
				result = '?'; 
			}
		}
		System.out.println(result);
		
	}
}
