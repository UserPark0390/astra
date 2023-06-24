package level1.level1_solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_가장가까운같은글자 {
	public static void main(String[] args) {
		String s = "banana";		
		System.out.println(Arrays.toString(solution(s)));
	}
	
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        List<String> check_s = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
        	int tmp = 0;
        	if(i == 0) {
        		answer[i] = -1;
        		check_s.add(s.charAt(i)+"");
        	} else if(check_s.contains(s.charAt(i)+"")) {
        		tmp = check_s.lastIndexOf(s.charAt(i)+"");
        		check_s.add(s.charAt(i)+"");
        		answer[i] = i-tmp;        		
        	} else {
        		answer[i] = -1;
        		check_s.add(s.charAt(i)+"");
        	}      	
        }    
        return answer;
    }
}	
