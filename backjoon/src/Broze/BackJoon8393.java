package Broze;

import java.util.Scanner;

public class BackJoon8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;

		for (int i = 1; i <= N; i++) {
			result += i;

		} // for end
		System.out.println(result);
	} // main end
}
