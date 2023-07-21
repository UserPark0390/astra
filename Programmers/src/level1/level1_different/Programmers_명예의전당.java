package level1.level1_different;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Programmers_명예의전당 {
	public static void main(String[] args) {
//		int k =  3;
//		int[] score = {10, 100, 20, 150, 1, 100, 200};
		int k = 4;
		int[] score = { 0, 300, 40, 300, 20, 70, 150, 50, 500, 1000 };
		System.out.println(Arrays.toString(solution(k, score)));
	}

	public static int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		for (int i = 0; i < score.length; i++) {
			priorityQueue.add(score[i]);
			if (priorityQueue.size() > k) {
				priorityQueue.poll();
			}
			answer[i] = priorityQueue.peek();
		}
		return answer;
	}
}
