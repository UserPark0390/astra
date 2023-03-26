package Sliver;

import java.util.Scanner;

public class BackJoon1978_소수찾기2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int count = 0;
		while (T-- > 0) {
			// 주어진 수
			int N = sc.nextInt();
			// 주어진 수마다 소수찾기
			boolean check = true;
			if(N == 1) {
				continue; // 다시 while문 시작점으로
			}
			for (int i = 2; i <= Math.sqrt(N); i++) {
				if(N % i == 0) {
					check = false;
					break;
				}
			}
			if(check == true) {
				count++;
			}
		}
		System.out.println(count);
	}
}
