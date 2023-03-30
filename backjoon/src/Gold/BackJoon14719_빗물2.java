package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon14719_빗물2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int [] a = new int[W];
		int result = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < W; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i < W-1; i++) {
			int wall = a[i]; // 현재 벽
			int left_wall = wall; // 왼쪽 벽
			int right_wall = wall; // 오른쪽 벽
			for(int j = i-1; j >= 0; j--) { // 왼쪽 최대 벽 탐색
				if(a[j] > wall) {
					left_wall = Math.max(left_wall, a[j]);
				}
			}
			for(int k = i+1; k < W; k++) {  // 오른쪽 최대 벽 탐색
				if(a[k] > wall) {
					right_wall = Math.max(right_wall, a[k]);
				}
			}
			if(Math.min(left_wall, right_wall) > wall) { // 현재 벽보다 높은 벽이 양쪽에 있을 경우
				result += (Math.min(left_wall, right_wall) - a[i]);
			}
		}
		System.out.println(result);
		
	}
}
