package Broze;

import java.util.Scanner;

public class BackJoon5086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int tmp = B/A;
		boolean check = true;
		
		while(true) {					
			if(B%A == 0) {
				check = false;
				sb.append("factor").append("\n");
			} else if(B*tmp == A) {
				check = false;
				sb.append("multiple").append("\n");
			} else {
				check = false;
				sb.append("neither").append("\n");
			}
			if(!check) {
				A = sc.nextInt();
				B = sc.nextInt();
				if(A == 0 || B==0) {
					break;
				}
				tmp = A/B;
			}
		}
		System.out.println(sb);
	}
}
