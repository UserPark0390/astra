package level1.level1_solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programmers_정수내림차순으로배치하기 {
	public static void main(String[] args) {
		long n = 118372;
		System.out.println(solution(n));
	}
	
    public static long solution(long n) {
        long answer = 0;
        String n_str = String.valueOf(n);
        Integer [] sort_n = new Integer [n_str.length()];        
        for(int i = 0; i < sort_n.length; i++) {
        	sort_n[i] = Integer.parseInt(n_str.charAt(i)+"");
        }        
        Arrays.sort(sort_n);
        List<Integer> list = Arrays.asList(sort_n);
        Collections.reverse(list);
        sort_n = list.toArray(sort_n);
        n_str = "";
        for(int j = 0; j < sort_n.length; j++) {
        	n_str += String.valueOf(sort_n[j]);
        }    
        answer = Long.parseLong(n_str);
        return answer;
    }
}
