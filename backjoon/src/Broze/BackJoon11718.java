package Broze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon11718 {
	public static void main(String[] args) throws IOException {	
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));)
		{
			String str;
			while((str = br.readLine()) != null) {
				String [] A = str.split("\\n");
				for(int i =0; i < A.length; i++) {
					System.out.println(A[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
