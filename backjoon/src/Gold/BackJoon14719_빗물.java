package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon14719_빗물 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int a[][] = new int[H][W]; // 2차원배열
		int result = 0;

		st = new StringTokenizer(br.readLine());
		for (int j = 0; j < W; j++) {
			System.out.println("");
			int check = Integer.parseInt(st.nextToken());
			for (int i = H - 1; i >= H - check; i--) {
				a[i][j] = 1;
				System.out.print(a[i][j] + " ");
			}
		}

		for (int i = H - 1; i >= 0; i--) {
			int count = 0;
			boolean wall = false;
			boolean rain = false;
			for (int j = 0; j < W; j++) {
				if(!wall && a[i][j] == 1) {
					wall = true;
				}
				if(wall && a[i][j] == 0) {
					count++;
					rain = true;
				}
				if(wall && rain && a[i][j] == 1) {
					result += count;
					count = 0;
					rain = false;
				}
			}
		}
		System.out.println(result);
	}
}
