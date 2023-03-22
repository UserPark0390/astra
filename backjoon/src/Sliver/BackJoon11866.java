package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BackJoon11866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		Queue<Integer> queue = new ArrayDeque<>();

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int count = 0;

		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}
		count = queue.size();
		sb.append("<");
		while (count-- > 0) {
			if (queue.size() > 1) {
				for (int i = 1; i < K; i++) {
					queue.add(queue.poll());
				}
				sb.append(queue.poll()).append(", ");
			} else {
				sb.append(queue.poll()).append(">");
			}
		}
		System.out.println(sb);
	}
}
