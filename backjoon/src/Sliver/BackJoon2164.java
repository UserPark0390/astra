package Sliver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;

public class BackJoon2164 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> queue = new ArrayDeque<>();
		int num = Integer.parseInt(br.readLine());
		int checkNum = 0;
		for(int i = 1; i <= num; i++) {
			queue.add(i);
		}
		checkNum = queue.size();
		while(checkNum-- > 1) {
			queue.poll();
			queue.add(queue.poll());
		}
		bw.write(queue.poll() + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
}
