package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BackJoon1018_체스판다시칠하기_0810 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		String field[][] = new String[M][N];
		String check[][] = new String[M][N];
		int count = 0;
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			String tmp = st.nextToken();
			for(int j = 0; j < N; j++) {
				field[i][j] = tmp.charAt(j)+"";
				if(i%2 == 0) {
					if(j%2 == 0) {
						check[i][j] = "W";
					} else {
						check[i][j] = "B";
					}					
				} else {
					if(j%2 == 0) {
						check[i][j] = "B"; 
					} else {
						check[i][j] = "W";
					}
				}
				if(!field[i][j].equals(check[i][j])) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
