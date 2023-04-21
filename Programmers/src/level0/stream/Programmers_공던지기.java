package level0.stream;

import java.util.ArrayList;
import java.util.List;

public class Programmers_공던지기 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};
		int k = 3;
		System.out.println(solution(numbers, k));
	}

	public static int solution(int[] numbers, int k) {
		int answer = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			list.add(numbers[i]);
		} // list 에 값을 다 넣고

		while (k-- > 0) {		
			for (int i = 0; i < 2; i++) {
				int tmp = list.get(0);
				list.remove(list.get(0));
				list.add(tmp);
			}
			if(k-1 == 0) {
				answer = list.get(0);
			}
		}
		return answer;
	}

}
