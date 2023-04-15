package level0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Programmers_진료순서정하기2 {

	public static void main(String[] args) {
		int[] emergency = {30, 10, 23, 6, 100};
		System.out.println(Arrays.toString(solution(emergency)));
	}

	public static int[] solution(int[] emergency) {
		 return Arrays.stream(emergency).map(i -> Arrays.stream(emergency).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(i) + 1).toArray();
	}
}
