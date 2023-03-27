package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BackJoon1127_최소힙 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> priorityqueue = new PriorityQueue<>();
		
		while(T-- > 0) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				if(priorityqueue.isEmpty()) {
					sb.append(0).append("\n");
				} else {
					sb.append(priorityqueue.poll()).append("\n");
				}
			} else {
				priorityqueue.add(num);
			}
		}
		System.out.println(sb);
	}
}
