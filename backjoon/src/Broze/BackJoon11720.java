package Broze;

import java.util.Scanner;

public class BackJoon11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int N = sc.nextInt();
		String Num = sc.next();
		int A [] = new int [N];
		int result = 0;
		
		for(int i =0; i < N; i++) {
			A[i] = Integer.parseInt(Num.valueOf(Num.charAt(i)));
			result += A[i];
		}
		System.out.println(result);
	}
}
