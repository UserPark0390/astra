package Sliver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class BackJoon11279_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		PriorityQueue<Integer> priorityqueue = new PriorityQueue<>(Collections.reverseOrder());
		int N = Integer.parseInt(st.nextToken());
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			if(x == 0) {
				if(priorityqueue.isEmpty()) {
					bw.write(0 + "\n");
				} else {
					bw.write(priorityqueue.poll() + "\n");
				}
			} else {
				priorityqueue.add(x);
			}
		}
		bw.flush();
		br.close();
		bw.close();		
	}
}
