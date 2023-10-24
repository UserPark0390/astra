package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon1018_체스판다시칠하기_1012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		String[][] chess = new String[M][N];
		boolean check = false; // 홀수 짝수에 따라 스위칭 / W B or B W 패턴 계산
		int count = 0;
		// String [][] chess_check = new String[M][N];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			String tmp = st.nextToken();
			check = (i % 2 == 0) ? true : false;
			for (int j = 0; j < N; j++) {
				String N_str = tmp.charAt(j)+"";
				chess[i][j] = N_str;
				if (check) {  // M이 0, 2 ,4 ... 일 때
					if (j % 2 == 0) {  // N이 0, 2 ,4 ... 일 때
						if(!N_str.equals("B")) { // B가 아니면 
							count++;
						}
					} else {  // N이 1, 3 ,5 ... 일 때
						if(!N_str.equals("W")) {
							count++;
						}
					}
				} else { // M이 1, 3 ,5 ... 일 때
					if (j % 2 == 0) {  // N이 0, 2 ,4 ... 일 때
						if(!N_str.equals("W")) {
							count++;
						}
					} else { // N이 1, 3 ,5 ... 일 때
						if(!N_str.equals("B")) {
							count++;
						}
					}
				}
			} // for 문
		}
		System.out.println(count);
	}
}
