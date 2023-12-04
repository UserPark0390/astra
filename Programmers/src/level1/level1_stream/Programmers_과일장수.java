package level1.level1_stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Programmers_과일장수 {
	public static void main(String[] args) {
		int k = 4;
		int m = 3;
		int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2 };
		System.out.println(solution(k, m, score));
	}

	public static int solution(int k, int m, int[] score) {
        if (score.length < m) {
            return 0;
        }
        int numSaleApple = m * (score.length / m);
        List<Integer> collect = Arrays.stream(score)
                .boxed()
                .sorted(Collections.reverseOrder())
                .limit(numSaleApple)
                .collect(Collectors.toList());
        return IntStream.range(0, collect.size())
                .filter(i -> i % m == m - 1)
                .map(collect::get)
                .reduce(Integer::sum)
                .getAsInt() * m;
    }
}
