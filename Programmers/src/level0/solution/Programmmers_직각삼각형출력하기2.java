package level0.solution;

import java.util.Scanner;

public class Programmmers_직각삼각형출력하기2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = n-i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}	
}
