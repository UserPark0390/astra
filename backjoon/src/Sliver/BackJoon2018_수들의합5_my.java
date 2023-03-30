package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon2018_수들의합5_my {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int tmp = 0;
		int result = 0;
		for(int i = 1; i <= N; i++) {
			for(int j = i; j <= N; j++) {
				tmp += j;
				if(tmp == N) {
					result++;
					break;
				} else if(tmp > N) {
					tmp = 0;
					break;
				} else {
					continue;
				}
			}
		}
		System.out.println(result);
	}
}
