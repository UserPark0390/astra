package Sliver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;
// 틀린 답 : Priority Queue를 사용해서 풀기
public class BackJoon11279 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Deque<Integer> deque = new ArrayDeque<>();
		int N = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());			
			if(x == 0) {
				if(deque.isEmpty()) { // 배열이 비어있을 경우
					bw.write(0 + "\n");  // 0을 출력
				} else {  // 배열에 값이 있을 경우
					bw.write(deque.pollFirst() + "\n"); // 가장 큰 수를 출력
				}				
			} else { // x가 0이 아닌 자연수일 때
				if(deque.isEmpty() || x >= deque.peekFirst() && deque.peekLast() < x) { // 데크가 비어있거나, 데크의 첫번째 값보다 크거나 같을 때
					deque.addFirst(x); // 데크 가장 앞에 넣는다
				} else if(x < deque.peekFirst()) { // 데크의 첫번째 값보다 작을 때
					deque.addLast(x); // 데크의 
				
				} else if(x < deque.peekFirst()) { // 데크의 첫번째 값보다 작을 때
					deque.addLast(x); // 데크의 
				}
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
