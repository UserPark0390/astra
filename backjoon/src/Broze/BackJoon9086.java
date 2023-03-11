package Broze;

import java.util.Scanner;

public class BackJoon9086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < T; i++) {
			String box = sc.next();
			sb.append(box.valueOf(box.charAt(0))).append(box.valueOf(box.charAt(box.length()-1))).append("\n");
		}
		System.out.print(sb);
		
	}
}

