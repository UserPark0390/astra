package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BackJoon5430_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		ArrayDeque<Integer> Deque = new ArrayDeque<Integer>();

		int T = Integer.parseInt(st.nextToken()); // 테스트 케이스 T

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(br.readLine()); // 배열에 들어 있는 수
			String str = st.nextToken();
			st = new StringTokenizer(br.readLine(), "[],");
			
			for (int j = 1; j <= N; j++) {
				Deque.add(Integer.parseInt(st.nextToken()));
			}

			boolean switching = true; // 정방향일때 true / R 1회 = 역방향, 역방향일 경우 false
			boolean error = false;    // error일 경우 true
			for (int k = 0; k < str.length(); k++) {
				char ch = str.charAt(k);  // char 타입으로 쪼개기
				if (ch == 'R') { // R이면 역방향
					switching = !switching;
				} else if (ch == 'D') {
					if (Deque.isEmpty()) {
						error = !error;
						break;
					}

					if (switching == true) { // 정방향
						Deque.pollFirst();
					} else {	// 역방향
						Deque.pollLast();
					}
				} // if end 
			} // for end

			if (error) {
				sb.append("error" + "\n");
			} else {
				sb.append("[");
				while (Deque.size() > 1) {
					if (switching) {
						sb.append(Deque.pollFirst() + ",");
					} else {
						sb.append(Deque.pollLast() + ",");
					}
				}
				if (Deque.size() == 0) { // 덱에 없으면
					sb.append("]" + "\n");
				} else { // 남은거 넣고 끝
					sb.append(Deque.pollFirst()).append("]" + "\n");
				}
			} // error else end
		} // i for end
		System.out.println(sb);
	} // main end
}
