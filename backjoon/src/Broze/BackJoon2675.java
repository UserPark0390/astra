package Broze;

import java.util.Scanner;

public class BackJoon2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			int R = sc.nextInt();
			String S = sc.nextLine();
			for(int j=1; j < S.length(); j++) {
				for(int k=0; k < R; k++) {
					sb.append(S.charAt(j));
				}
			}
			sb.append("\n");
		} // for end
		System.out.println(sb);
	}
}
