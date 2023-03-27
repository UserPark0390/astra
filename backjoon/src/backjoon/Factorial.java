package backjoon;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(factory(N));
	}
	
	public static int factory(int N) {
		if(N == 1) {
			return 1;	
		}
		return N * factory(N-1);
	}
}
