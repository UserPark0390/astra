package level1.level1_stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Programmers_명예의전당 {
	public static void main(String[] args) {
//		int k =  3;
//		int[] score = {10, 100, 20, 150, 1, 100, 200};
		int k = 4;
		int[] score = { 0, 300, 40, 300, 20, 70, 150, 50, 500, 1000 };
		System.out.println(Arrays.toString(solution(k, score)));
	}

	public static int[] solution(int k, int[] score) {
	       Integer[] scores = new Integer[score.length];

	        return IntStream.range(0, score.length)
	                .peek(i -> scores[i] = score[i])
	                .map(i -> {
	                    Arrays.sort(scores, 0, i + 1, Collections.reverseOrder(Integer::compare));
	                    return i < k ? scores[i] : scores[k - 1];
	                })
	                .toArray();
	}
}
