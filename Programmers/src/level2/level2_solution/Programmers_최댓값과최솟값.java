package level2.level2_solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Programmers_최댓값과최솟값 {
	public static void main(String[] args) {
		String s = "-1 -1";
		System.out.println(solution(s));
	}
	
    public static String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s);
        List<Integer> list = new ArrayList<>();
        int count = st.countTokens();
        for(int i = 0; i < count; i++) {
        	list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        answer = list.get(0) + " " + list.get(list.size()-1);   
        return answer;
    }
}
