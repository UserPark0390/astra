package level1.level1_solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers_문자열내림차순배치하기 {
	public static void main(String[] args) {
		String s = "Zbciefg";
		System.out.println(solution(s));
	}
    public static String solution(String s) {
        String answer = "";
        List<String> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
        	list.add(s.charAt(i)+"");
        }
        Collections.sort(list);
        Collections.reverse(list);
        for(int i = 0; i < s.length(); i++) {
        	answer += list.get(i);
        }
        return answer;
    }
}
