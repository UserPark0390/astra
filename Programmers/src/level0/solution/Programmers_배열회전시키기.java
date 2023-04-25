package level0.solution;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Programmers_배열회전시키기 {
	
	public static void main(String[] args) {
		int[] numbers = {4, 455, 6, 4, -1, 45, 6};
		String direction = "right";
		System.out.println(Arrays.toString(solution(numbers, direction)));
	}
	
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i < numbers.length; i++) {
        	deque.addLast(numbers[i]);
        }
        System.out.println(direction.equals("right"));
        if(direction == "left") {
        	deque.addLast(deque.getFirst());
        	deque.pollFirst();
        } else if (direction == "right"){
        	deque.addFirst(deque.getLast());
        	deque.pollLast();
        }
        for(int i = 0; i < numbers.length; i++) {
        	answer[i] = deque.pollFirst();
        }
        
        return answer;
    }
}

