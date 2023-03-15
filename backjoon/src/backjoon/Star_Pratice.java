package backjoon;

import java.util.Scanner;

public class Star_Pratice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println("------------------ 1단계 ----------------------");
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("------------------ 2단계 ----------------------");
		for(int i = 0; i < N; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("------------------ 3단계 ----------------------");
		for(int i = 0; i < N; i++) {
			for(int j = N; j > 0; j--) {
				if(i < j) {
					System.out.print("*");
				} else {
					System.out.print("");
				}
			}
			System.out.println();
		}
		System.out.println("------------------ 4단계 ----------------------");
		for(int i = 1; i < 5; i++) {
			for(int j = 4; j > 0; j--) {
				if(i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}		
		System.out.println("------------------ 5단계 ----------------------");

		
		for(int i=0;i<4;i++){
			for(int j=0;j<3-i;j++){
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("*"); 
			}
			System.out.println("");
		} 
		System.out.println("------------------ 5.5단계 ----------------------");
		

			
		
		
	}
}
