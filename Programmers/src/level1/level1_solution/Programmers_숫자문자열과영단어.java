package level1.level1_solution;

import java.util.HashMap;
import java.util.Map;

public class Programmers_숫자문자열과영단어 {

	public static void main(String[] args) {
		String s = "23four5six7";
		System.out.println(solution(s));
	}
	
    public static int solution(String s) {
        int answer = 0;
        String change_answer = "";
        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        
        String str = "";
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) - '0' <= 9) {
        		change_answer += (s.charAt(i)+"");        				
        	} else {
        		str += s.charAt(i)+"";
        		if(map.containsKey(str)) {
        			change_answer += map.get(str);
        			str = "";
        		}
        	}
        }
        answer = Integer.parseInt(change_answer);   
        return answer;
    }
	
}

