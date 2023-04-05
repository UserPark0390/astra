package Broze.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon2720_세탁소사장동혁 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < T; i++) {
			int C = Integer.parseInt(br.readLine());
			int Quarter = 0;
			int Dime = 0;
			int Nickle = 0;
			int Penny = 0;
			
			if(C/25 > 0) {
				Quarter = C/25;
				C = C-(Quarter*25);
			}
			if(C/10 > 0) {
				Dime = C/10;
				C = C-(Dime*10);
			}
			if(C/5 > 0) {
				Nickle = C/5;
				C = C-(Nickle*5);
			}
			Penny = C;
			sb.append(Quarter).append(" ").append(Dime).append(" ").append(Nickle).append(" ").append(Penny).append("\n");
		}
		System.out.println(sb);
	}
}
