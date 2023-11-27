package level2.level2_solution;

import java.util.Collections;
import java.util.PriorityQueue;

// 우선순위 큐를 이용한 풀이
public class Programmers_최솟값만들기_231127 {
	public static void main(String[] args) {
		int[] A = { 1, 4, 2 };
		int[] B = { 5, 4, 4 };
		System.out.println(solution(A, B));
	}

	public static int solution(int[] A, int[] B) {
		int answer = 0;
		PriorityQueue<Integer> list_A = new PriorityQueue();
		PriorityQueue<Integer> list_B = new PriorityQueue(Collections.reverseOrder());

		for (int i = 0; i < A.length; i++) {
			list_A.add(A[i]);
			list_B.add(B[i]);
		}

		while (!list_A.isEmpty()) {
			answer += list_A.remove() * list_B.remove();
		}

		return answer;
	}
}
