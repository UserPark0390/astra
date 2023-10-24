package level1.level1_different;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Programmers_두개뽑아서더하기2 {
	public static void main(String[] args) {
		int[] numbers = {5, 0, 2, 7 , 1, 3 , 2};
		System.out.println(solution(numbers));				
	}

    public static ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()) {
            answer.add(iter.next());
        }

        Collections.sort(answer);
        return answer;
    }
}
