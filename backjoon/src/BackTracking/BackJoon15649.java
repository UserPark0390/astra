package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon15649 {
	static int n, m;
	static boolean check[];
	static int A[];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		check = new boolean[n + 1];
		A = new int[n + 1];
		Tracking(0);
		System.out.println(sb);
	}

	private static void Tracking(int index) {
		// 인덱스가 마지막 위치에 도달하면 수열 출력
		if (index == m) {
			for (int i = 0; i < m; i++) {
				sb.append(A[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		// 1부터 ~ N개의 수를 선택
		for (int i = 1; i <= n; i++) {
			if (check[i]) { // 이미 선택한 적이 있다면 다음으로
				continue;
			}
			check[i] = true; // 수 i를 사용
			A[index] = i; // 해당 위치에 i를 넣는다
			Tracking(index + 1); // 위치를 1 증가 시키고 재귀
			check[i] = false; // index 뒤에 이렁날 모든 경우를 했기 때문에 수 i를 사용하지않았다고 바꾼다.

		}

	}

}
