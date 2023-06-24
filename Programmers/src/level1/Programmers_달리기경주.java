package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_달리기경주 {
	public static void main(String[] args) {
		String[] players = { "mumu", "soe", "poe", "kai", "mine" };
		String[] callings = { "kai", "kai", "mine", "mine" };
		System.out.println(Arrays.toString(solution(players, callings)));
	}
	// 시간복잡도에 걸린다 players가 최대 5만이라서
	// 따라서, Hashmap으로 풀어야한다.
	
	public static String[] solution(String[] players, String[] callings) {
		String[] answer = new String[players.length];
		List<String> players_list = new ArrayList<>(Arrays.asList(players));
		for (int i = 0; i < callings.length; i++) {
			String tmp = "";
			int tmp_index = 0;
			if (players_list.contains(callings[i])) {
				tmp_index = players_list.indexOf(callings[i]);
				tmp = players_list.get(tmp_index - 1);
				players_list.set(tmp_index - 1, callings[i]);
				players_list.set(tmp_index, tmp);
			}
		}
		for (int k = 0; k < players.length; k++) {
			answer[k] = players_list.get(k);
		}

		return answer;
	}
}
