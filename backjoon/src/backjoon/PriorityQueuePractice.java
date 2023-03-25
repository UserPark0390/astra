package backjoon;

import java.util.PriorityQueue;

public class PriorityQueuePractice {
	public static void main(String[] args) {
		PriorityQueue<Integer> p_q = new PriorityQueue<>();
		
		p_q.add(1);
		p_q.add(15);
		p_q.offer(10);
		p_q.add(21);
		p_q.add(25);
		p_q.offer(18);
		p_q.add(8);
		
		System.out.println(p_q);
		
		p_q.poll();
		System.out.println(p_q);

	}
}
