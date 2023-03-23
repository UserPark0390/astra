package Sliver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class BackJoon1021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		LinkedList<Integer> deque = new LinkedList<Integer>();
		List<Integer> list = new ArrayList<>();
		int result = 0; // 결과값 출력
		int count = M;
		for (int i = 1; i <= N; i++) {
			deque.addLast(i);
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		while (count > 0) {
			while (true) {
				if (deque.getFirst() == list.get(0)) { // 첫번째
					deque.pollFirst();
					list.remove(0);
					count--;
					break;
				}
				if (deque.indexOf(list.get(0)) <= deque.size() / 2) { // 두번째
					deque.offerLast(deque.pollFirst());
				} else {
					deque.offerFirst(deque.pollLast()); // 세번째
				}
				result++;
			} // while end
		} // while end
		bw.write(result + "");
		bw.flush();
		br.close();
		bw.close();
	}
}
