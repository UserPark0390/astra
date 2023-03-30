package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon2018_수들의합5_sol {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 1; // while문을 N까지 안 돌리기 때문에 (N으로 미리 count)
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		while(end_index!=N) {
			if(sum == N) {
				count++;
				end_index++;
				sum = sum + end_index;
			} else if(sum > N) {
				sum = sum - start_index;
				start_index++;
			} else {
				end_index++;
				sum = sum + end_index;
			}
		}
		System.out.println(count);
	}
}
