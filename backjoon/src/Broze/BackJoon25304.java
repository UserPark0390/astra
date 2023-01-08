package Broze;

import java.util.Scanner;

public class BackJoon25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); // 영수증에 적힌 총 금액
		int N = sc.nextInt(); // 영수증에 적힌 구매한 물건의 종류의 수
		int result = 0;

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			result += a * b;

		}	// for end

		if (result == X) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
