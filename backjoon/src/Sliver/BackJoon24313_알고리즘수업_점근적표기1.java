package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon24313_알고리즘수업_점근적표기1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int D = Integer.parseInt(st.nextToken());
		
		System.out.println("A * D + B : " + ((A*D) + B));
		System.out.println("C*D : " + C*D );
		
		if((A*D)+B <= C*D && C >= A) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	
	}
}
