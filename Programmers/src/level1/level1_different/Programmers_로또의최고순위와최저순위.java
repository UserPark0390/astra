package level1.level1_different;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Programmers_로또의최고순위와최저순위 {
	public static void main(String[] args) {
		int[] lottos = { 44, 1, 0, 0, 31, 25 };
		int[] win_nums = { 31, 10, 45, 1, 6, 19 };
		System.out.println(Arrays.toString(solution(lottos, win_nums)));
	}

	public static int[] solution(int[] lottos, int[] win_nums) {
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		int zeroCount = 0;

		for (int lotto : lottos) {
			if (lotto == 0) {
				zeroCount++;
				continue;
			}
			map.put(lotto, true);
		}

		int sameCount = 0;
		for (int winNum : win_nums) {
			if (map.containsKey(winNum))
				sameCount++;
		}

		int maxRank = 7 - (sameCount + zeroCount);
		int minRank = 7 - sameCount;
		if (maxRank > 6)
			maxRank = 6;
		if (minRank > 6)
			minRank = 6;

		return new int[] { maxRank, minRank };
	}

}
