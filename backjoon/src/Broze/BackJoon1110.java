package Broze;

import java.util.Scanner;

public class BackJoon1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // N 값 비교
		int N_change = 0; //
		int tmp = 0;
		int result = 0;
		int result_tmp = 0;
		int count = 0;

		N_change = N / 10 + N % 10;
		tmp = N % 10;

		while (N != result) {
			result_tmp = tmp % 10 + N_change % 10; // 6 + 8 result 14
			result = tmp % 10 * 10 + N_change % 10;
			tmp = N_change % 10;
			N_change = result_tmp % 10;

			count++;
			if (N == result) {
				break;
			}
		} // while end
		
		if(N == 0) {
			count++;
		}
		System.out.println(count);

	}
}
