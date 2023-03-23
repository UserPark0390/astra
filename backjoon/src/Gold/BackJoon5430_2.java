package Gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BackJoon5430_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken()); // 테스트 케이스
		while (T-- > 0) {
			Deque<Integer> deque = new ArrayDeque<>();
			st = new StringTokenizer(br.readLine());
			boolean change = true; // 정방향
			boolean error = false; // 에러체크
			String str = st.nextToken(); // 함수 저장
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 배열에 들어가는 수의 개수
			st = new StringTokenizer(br.readLine(), "[],"); // [ | , | ] 제거하고 토큰
			
			for (int i = 0; i < N; i++) { // 데큐에 값 넣기
				deque.addLast(Integer.parseInt(st.nextToken()));
			}
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'R') { // R = reverse
						change = !change;
				} else if (str.charAt(i) == 'D') {
					if (deque.isEmpty()) {
						error = !error;
						bw.write("error" + "\n");
						break;
					} else {
						if (change) {
							deque.pollFirst();
						} else {
							deque.pollLast();
						}
					}
				}
			}
			if (!error) {
				if (deque.size() == 1) {
					bw.write("[" + deque.getFirst() + "]");
				} else {
					bw.write("[");
					int size = deque.size();
					for (int i = 0; i < size; i++) {
						if (change) {
							if (i == size - 1) {
								bw.write(deque.pollFirst() + "]" + "\n");
							} else {
								bw.write(deque.pollFirst() + ",");
							}
						} else {
							if (i == size - 1) {
								bw.write(deque.pollLast() + "]" + "\n");
							} else {
								bw.write(deque.pollLast() + ",");
							}
						}
					}
				}
			}

		} // while end
		bw.flush();
		br.close();
		bw.close();
	}
}
