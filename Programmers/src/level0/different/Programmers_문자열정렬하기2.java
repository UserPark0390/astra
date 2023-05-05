package level0.different;

import java.util.Arrays;

public class Programmers_문자열정렬하기2 {
	public static void main(String[] args) {
		String my_string = "Bcad";
		System.out.println(solution(my_string));
	}
	
    public static String solution(String my_string) {
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
	
}
