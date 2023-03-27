package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BackJoon11286_절대값힙 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> priorityqueue = new PriorityQueue<>((o1, o2) ->
		Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1, o2) : Integer.compare(Math.abs(o1), Math.abs(o2)));
		
// 		※ 아래의 코드와 동일하다.		
//		PriorityQueue<Integer> queue = new PriorityQueue<>(
//		        (o1, o2) -> {
//		            if (Math.abs(o1) == Math.abs(o2)) { //절댓값이 같은 경우
//		                return o1 > o2 ? 1 : -1;
//		                //o1이 더 크다면 양수 반환 -> o1과 o2의 자리를 바꾼다
//		                //o1이 더 작다면 음수 반환 -> 지금의 자리를 유지한다
//		            } else { //절댓값이 같지 않은 경우 절댓값이 작은 순서로 정렬한다
//		                return Math.abs(o1) - Math.abs(o2); 
//		                //양수가 반환되면 o1의 절댓값이 더 큰 경우이다 -> o2, o1순으로 정렬
//		                //음수가 반환되면 o2의 절대값이 더 큰 경우이다 -> o1, o2 유지
//		            }
//		        }
//		);
		
		for(int i = 0; i < N; i++) {
			int Num = Integer.parseInt(br.readLine());
			if(Num == 0) {
				if(priorityqueue.isEmpty()) {
					sb.append(0).append("\n");
				} else {
					sb.append(priorityqueue.poll()).append("\n");
				}
			} else {
				priorityqueue.add(Num);
			}
		}
		System.out.println(sb);	
	}
}
