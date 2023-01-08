package Broze;

import java.util.Scanner;

public class BackJoon10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int maxTmp = 0;
		int minTmp = 0;
		int A[] = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if (maxTmp == 0 && minTmp == 0) {
				maxTmp = A[i];
				minTmp = A[i];
			} // 최솟값 0 제외
			
			if (A[i] > maxTmp) {
				maxTmp = A[i];
			} else if (A[i] < minTmp) {
				minTmp = A[i];
			}
		} // for end
		System.out.println(minTmp + " " + maxTmp);
	}
}
