package level0.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_문자열정렬하기1_1 {
	public static void main(String[] args) {
		String my_string = "p2o4i8gj2";
		System.out.println(Arrays.toString(solution(my_string)));
	}
	
    public static int[] solution(String my_string) {
        List<String>list = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++) {
        	if(my_string.charAt(i) - 48 >= 0 && my_string.charAt(i) - 48 <= 9) {
        		list.add(Character.toString(my_string.charAt(i)));
        	}
        }
        int [] answer = new int [list.size()];
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = Integer.valueOf(list.get(i)); 
        }
        Arrays.sort(answer);
        
        return answer;
    }
	
}
