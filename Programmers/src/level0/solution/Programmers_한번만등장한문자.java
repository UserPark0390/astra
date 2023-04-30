package level0.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers_한번만등장한문자 {
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(solution(s));
	}

	public static String solution(String s) {
		String answer = "";
		List<Character> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			list.add(s.charAt(i));
		}
		Collections.sort(list);
		char ch = ' ';
		int count = 0;
		for(int j = 0; j < list.size(); j++) {
			if(count == 0) {
				ch = list.get(j);
				count++;
			} else {
				if(ch == list.get(j)) {
					count++;
				} else {
					if(count == 1) {
						answer += Character.toString(ch);
						ch = list.get(j);
						count = 1;
					} else {
						count = 1;
						ch = list.get(j); 
					}
				}
			}
			if(list.size()-1 == j) {
				if(count == 1) {
					answer += Character.toString(ch);	
				}
			}
		}			
		return answer;
	}
}
