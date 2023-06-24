package level1.level1_different;

import java.util.*;

public class Programmers_가장가까운같은글자 {
	public static void main(String[] args) {
		String s = "banana";		
		System.out.println(Arrays.toString(solution(s)));
	}
	
    public static int[] solution(String s) {
            int[] answer = new int[s.length()];
            HashMap<Character,Integer> map = new HashMap<>();
            for(int i=0; i<s.length();i++){
                char ch = s.charAt(i);
                answer[i] = i-map.getOrDefault(ch,i+1);
                map.put(ch,i);
            }
            return answer;
    }
}	
