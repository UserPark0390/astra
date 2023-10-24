package level1.level1_solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_두개뽑아서더하기 {
	public static void main(String[] args) {
		int[] numbers = {5, 0, 2, 7 , 1, 3 , 2};
		System.out.println(Arrays.toString(solution(numbers)));				
	}

	public static int[] solution(int[] numbers) {
		List<Integer> list = new ArrayList<>();
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			int tmp = 0;
			for (int j = 1; j < numbers.length - i; j++) {
				tmp = numbers[i] + numbers[i + j];
				if (!list.contains(tmp)) {
					list.add(tmp);
				}
			}
		}
		int[] answer = list.stream().sorted().mapToInt(i->i).toArray();
		return answer;
	}
}
