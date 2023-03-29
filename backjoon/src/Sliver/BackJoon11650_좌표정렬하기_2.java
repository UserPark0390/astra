package Sliver;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BackJoon11650_좌표정렬하기_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] A = new int[N][2];

		for (int i = 0; i < N; i++) {

			A[i][0] = sc.nextInt();
			A[i][1] = sc.nextInt();
		};
		
		Arrays.sort(A, new Comparator<int[]>() {

			@Override
			public int compare(int[] x, int[] y) {
				if (x[0] == y[0])
					return x[1] - y[1];
				else
					return x[0] - y[0];
			}
		});
		for (int i = 0; i < N; i++) {
			System.out.println(A[i][0] + " " + A[i][1]);
		}
	}
}