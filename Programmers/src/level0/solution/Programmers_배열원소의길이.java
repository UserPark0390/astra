package level0.solution;

import java.util.Arrays;

public class Programmers_배열원소의길이 {
	public static void main(String[] args) {
		String[] strlist = {"I", "Love", "Programmers."};
		System.out.println(Arrays.toString(solution(strlist)));
	}
	
    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++) {
        	String str = strlist[i];
        	answer[i] = str.length();
        }        
        return answer;
    }
	
}
