package level0.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Programmers_등수매기기 {
	public static void main(String[] args) {
		//int[][] score = { { 80, 70 }, { 90, 50 }, { 40, 70 }, { 0, 80 } };
		//int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}, {0 , 0}};
		int[][] score = {{1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {7, 1}, {8, 1}, {9, 1}, {0 , 0}};
		System.out.println(Arrays.toString(solution(score)));
	}

	public static int[] solution(int[][] score) {
		 return Arrays.stream(score).map(ints -> Arrays.stream(ints).average().orElse(0)).mapToInt(d -> Arrays.stream(score).map(ints -> Arrays.stream(ints).average().orElse(0)).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(d) + 1).toArray();
	}

}
