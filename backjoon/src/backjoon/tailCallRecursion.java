package backjoon;

import java.util.Scanner;

public class tailCallRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));	
	}
	
	private static int factorial(int n) {
		return factorialMethod(n ,1);
	}
	private static int factorialMethod(int n, int value) {
		if(n == 1) {
			return value;
		}
		return factorialMethod(n-1, value * n);
	}
}