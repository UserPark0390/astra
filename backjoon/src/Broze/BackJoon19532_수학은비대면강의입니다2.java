package Broze;

import java.util.Scanner;

public class BackJoon19532_수학은비대면강의입니다2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		int x = (c*e-b*f)/(a*e-b*d); 
		int y = (c*d-a*f)/(b*d-a*e);
	
		sb.append(x).append(" ").append(y);
		System.out.println(sb);
			
		
		
	}
}
