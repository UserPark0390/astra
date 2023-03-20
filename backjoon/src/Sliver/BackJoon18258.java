package Sliver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BackJoon18258 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		int N = Integer.parseInt(st.nextToken());
		String str = "";
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			str = st.nextToken();
			switch (str) {
			case "push":
				deque.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if(deque.isEmpty() != true) {
					bw.write(deque.pollFirst()+ "\n");
				} else {
					bw.write(-1 + "\n");
				}
				break;
			case "size":
				bw.write(deque.size() + "\n");
				break;
			case "empty":
				if(deque.isEmpty() == true) {
					bw.write(1 + "\n");
				} else {
					bw.write(0 + "\n");
				}
				break;
			case "front":
				if(deque.peekFirst() != null) {
					bw.write(deque.peekFirst() + "\n");	
				} else {
					bw.write(-1 + "\n");
				}
				break;
			case "back":
				if(deque.peekLast() != null) {
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
