package level1.level1_solution;

import java.util.Arrays;

public class Programmers_달리기경주2 {
	public static void main(String[] args) {
		String[] players = { "mumu", "soe", "poe", "kai", "mine" };
		String[] callings = { "kai", "kai", "mine", "mine" };
		System.out.println(Arrays.toString(solution(players, callings)));
	}

	public static String[] solution(String[] players, String[] callings) {
		String[] answer = new String[players.length];

		for (int i = 0; i < callings.length; i++) {
			String tmp = "";
			for (int j = 0; j < players.length; j++) {
				if (callings[i].equals(players[j])) {
					tmp = players[j - 1];
					players[j - 1] = players[j];
					players[j] = tmp;
					tmp = "";
				}
			}
		}
		for (int k = 0; k < players.length; k++) {
			answer[k] = players[k];
		}

		return answer;
	}
}
