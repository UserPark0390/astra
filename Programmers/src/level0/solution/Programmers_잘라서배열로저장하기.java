package level0.solution;

import java.util.Arrays;

public class Programmers_잘라서배열로저장하기 {
	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		System.out.println(Arrays.toString(solution(my_str, n)));
	}
	
    public static String[] solution(String my_str, int n) {
    	int size = 0;
    	if(my_str.length() % n == 0) {
    		size = my_str.length() / n;
    	} else {
    		size = (my_str.length() / n) +1 ;
    	}
        String[] answer = new String[size];
        int count = 0;
        String tmp = "";
        for(int i = 0; i < my_str.length(); i++) {
        	char ch = my_str.charAt(i);
        	tmp += Character.toString(ch);
        	if(tmp.length() == n) {
        		answer[count] = tmp;
        		tmp = "";
        		count++;
        	} else if(my_str.length() -1 == i) {
        		answer[count] = tmp;
        	}
        }
        return answer;
    }
}
