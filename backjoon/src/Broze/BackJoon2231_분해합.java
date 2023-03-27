package Broze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon2231_분해합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int result = Integer.parseInt(N);
		for(int i = 0; i < N.length(); i++) {
			System.out.println(N.charAt(i));			
			result += Character.getNumericValue(N.charAt(i));
		}
		System.out.println(result);
		
	}
}
