package level0.solution;

import java.util.Arrays;

public class Programmers_문자열정렬하기2 {
	public static void main(String[] args) {
		String my_string = "Bcad";
		System.out.println(solution(my_string));
	}
	
    public static String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        char [] ch = my_string.toCharArray();
        Arrays.sort(ch);
        answer = new String(ch);
        return answer;
    }
	
}
