package level0.stream;

import java.util.stream.IntStream;
import java.util.HashMap;

public class Programmers_겹치는선분의길이 {
	public static void main(String[] args) {
		// int[][] lines = { { -10, -1 }, { -2, 5 }, { 3, 9 } };
		// int[][] lines = { { 0, 5 }, { 3, 9 }, { 1, 10 } };
		// int[][] lines = {{0, 2}, {-3, -1}, {-2, 1}};
		int[][] lines = { { -10, 5 }, { -7, 3 }, { 0, 10 } };
		System.out.println(solution(lines));
	}

	public static int solution(int[][] lines) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int line[]: lines) {
            IntStream.range(Math.min(line[0],line[1]),Math.max(line[0],line[1])).forEach(i->count.put(i, count.getOrDefault(i, 0)+1));
        }

        return (int) count.values().stream().filter(i -> i > 1).count();

	}
}
