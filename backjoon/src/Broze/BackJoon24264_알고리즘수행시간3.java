package Broze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon24264_알고리즘수행시간3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long N = Long.parseLong(br.readLine());
		// 이중 for 문으로 N*N 만큼의 시간이 소요 -> O(n^2)만큼의 시간복잡도를 가진다
		System.out.println(N*N);
		System.out.println(2);
	}
}
