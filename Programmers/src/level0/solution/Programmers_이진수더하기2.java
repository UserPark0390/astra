package level0.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Programmers_이진수더하기2 {
	public static void main(String[] args) {
		String bin1 = "10";
		String bin2 = "11";
		System.out.println(solution(bin1,bin2));
	}
	
    public static String solution(String bin1, String bin2) {
    	String answer = "";
    	char [] bin1_char = new char[bin1.length()];
    	char [] bin2_char = new char[bin2.length()];
    	List<Character> list = new ArrayList<>();
    	for(char ch : bin1_char) {
    		list.add(ch);
    	}
        Collections.reverse(list);
        ListIterator li = list.listIterator();
        while(li.hasNext()) {
        	
        }
//        for(int i = 0; i < bin1.length(); i++) {
//        	
//        }
        
        return answer;
    }
}
