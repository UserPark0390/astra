package Broze;

import java.util.Scanner;

public class BackJoon2444 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.println("*");
			for(int j = 0; j < N-1; j++) {
				System.out.print("*");
			}
		}
		
		
	}
}
