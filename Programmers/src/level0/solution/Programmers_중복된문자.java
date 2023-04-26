package level0.solution;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Programmers_중복된문자 {
	public static void main(String[] args) {
		String my_string = "people";
		System.out.println(solution(my_string));
	}

	public static String solution(String my_string) {
		String answer = "";
		List<Character>list = new ArrayList<>();
		for (int i = 0; i < my_string.length(); i++) {
			char ch_my_string = my_string.charAt(i);
			list.add(ch_my_string);
		}
		Set<Character> set = new LinkedHashSet<Character>(list);
		List<Character>newList = new ArrayList<>(set);
		for (int i = 0; i < newList.size(); i++) {
			answer += Character.toString(newList.get(i));
		}
		return answer;
	}
}
