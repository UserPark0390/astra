package Sliver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BackJoon10866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		Deque<Integer> deque = new ArrayDeque<>();
		while (N-- > 0) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			switch (str) {
			case "push_front":
				deque.addFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				deque.addLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				if(!deque.isEmpty()) {
					bw.write(deque.pollFirst() + "\n");
				} else {
					bw.write(-1 + "\n");
				}				
				break;
			case "pop_back":
				if(!deque.isEmpty()) {
					bw.write(deque.pollLast() + "\n");
				} else {
					bw.write(-1 + "\n");
				}
				break;
			case "size":
				bw.write(deque.size() + "\n");
				break;
			case "empty":
				if (deque.isEmpty()) {
					bw.write(1 + "\n");
				} else {
					bw.write(0 + "\n");
				}
				break;
			case "front":
				if (!deque.isEmpty()) {
					bw.write(deque.peekFirst() + "\n");
				} else {
					bw.write(-1 + "\n");
				}
				break;
			case "back":
				if (!deque.isEmpty()) {
					bw.write(deque.peekLast() + "\n");
				} else {
					bw.write(-1 + "\n");
				}
				break;
			}
			
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
