package level1.level1_solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Programmers_신고결과받기 {
	public static void main(String[] args) {
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		int k = 2;
		System.out.println(Arrays.toString(solution(id_list, report, k)));
	}

	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		Map<String, HashSet<String>> report_list = new HashMap();
		Map<String, Integer> report_check = new HashMap();
		for (int i = 0; i < id_list.length; i++) {
			report_list.put(id_list[i], new HashSet<>());
			report_check.put(id_list[i], i);
		}
		for (String s : report) {
			String[] str = s.split(" ");
			String notify = str[0];
			String warn = str[1];
			report_list.get(warn).add(notify);
		}
		for (int j = 0; j < id_list.length; j++) {
			HashSet<String> send = report_list.get(id_list[j]);
			if (send.size() >= k) {
				for (String s : send) {
					answer[report_check.get(s)]++;
				}
			}
		}

		return answer;
	}
}
