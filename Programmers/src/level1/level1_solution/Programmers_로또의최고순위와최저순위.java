package level1.level1_solution;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Programmers_로또의최고순위와최저순위 {
	public static void main(String[] args) {
		int[] lottos = { 44, 1, 0, 0, 31, 25 };
		int[] win_nums = { 31, 10, 45, 1, 6, 19 };
		// System.out.println(solution(lottos, win_nums));
		System.out.println(Arrays.toString(solution(lottos, win_nums)));
	}

	public static int[] solution(int[] lottos, int[] win_nums) {
		int highrank = 0;
		int lowrank = 0;
		List<String> list_lottos = Arrays.stream(lottos).mapToObj(String::valueOf).sorted()
				.collect(Collectors.toList());
		for (int i = 0; i < 6; i++) {
			if (list_lottos.get(i).equals("0"))
				highrank++;
			if (list_lottos.contains(win_nums[i] + "")) {
				highrank++;
				lowrank++;
			}
		}
		highrank = rank(highrank);
		lowrank = rank(lowrank);
		int[] answer = { highrank, lowrank };
		return answer;
	}

	private static int rank(int count) {
		int rank_lotto = 0;
		switch (count) {
		case 6:
			rank_lotto = 1;
			break;
		case 5:
			rank_lotto = 2;
			break;
		case 4:
			rank_lotto = 3;
			break;
		case 3:
			rank_lotto = 4;
			break;
		case 2:
			rank_lotto = 5;
			break;
		default:
			rank_lotto = 6;
		}
		return rank_lotto;
	}

}
