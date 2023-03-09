package Broze;

import java.util.Scanner;

public class BackJoon25314 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int N = sc.nextInt();
		
		for(int i = 0; i < N/4; i++) {
			sb.append("long").append(" ");
		}
		
		sb.append("int");
		
		System.out.println(sb);
		
	}
}
