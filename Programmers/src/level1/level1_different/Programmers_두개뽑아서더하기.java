package level1.level1_different;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Programmers_두개뽑아서더하기 {
	public static void main(String[] args) {
		int[] numbers = {5, 0, 2, 7 , 1, 3 , 2};
		System.out.println(Arrays.toString(solution(numbers)));				
	}

	public static int[] solution(int[] numbers) {
        Set<Integer> sumNumber = new TreeSet<>();

        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                sumNumber.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[sumNumber.size()];
        int index = 0;
        Iterator itor = sumNumber.iterator();
        while(itor.hasNext()){
            answer[index] = (int)itor.next();
            index++;
        }

        return answer;
    }
}
