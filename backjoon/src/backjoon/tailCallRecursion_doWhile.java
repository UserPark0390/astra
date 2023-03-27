package backjoon;

import java.util.Scanner;

public class tailCallRecursion_doWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));	
	}
	static int factorial(int n) {
		   int value = 1;		 
		   do {
		     if (n == 1) 
		       return value;
		     value = value * n;
		     n = n - 1;
		   } while(true);
		}
}