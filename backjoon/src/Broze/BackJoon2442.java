package Broze;

import java.util.Scanner;

public class BackJoon2442 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			for(int j = N; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j < i*2; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}	
	}
}
