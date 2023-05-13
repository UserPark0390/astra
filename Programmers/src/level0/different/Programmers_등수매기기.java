package level0.different;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programmers_등수매기기 {
	public static void main(String[] args) {
		//int[][] score = { { 80, 70 }, { 90, 50 }, { 40, 70 }, { 0, 80 } };
		//int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}, {0 , 0}};
		int[][] score = {{1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {7, 1}, {8, 1}, {9, 1}, {0 , 0}};
		System.out.println(Arrays.toString(solution(score)));
	}

	public static int[] solution(int[][] score) {
		int[] answer = new int[score.length];
		double[] avg = new double[score.length];
		List<Double> list = new ArrayList<>();
		for (int i = 0; i < score.length; i++) {
			avg[i] = (score[i][0] + score[i][1]) / 2.0;
			list.add(avg[i]);
		}

		Collections.sort(list);
		Collections.reverse(list);

		for (int j = 0; j < score.length; j++) {
			answer[j] = list.indexOf(avg[j])+1;
		}

		return answer;
	}

}
