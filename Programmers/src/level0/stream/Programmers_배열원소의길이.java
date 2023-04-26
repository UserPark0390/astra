package level0.stream;

import java.util.Arrays;

public class Programmers_배열원소의길이 {
	public static void main(String[] args) {
		String[] strlist = {"I", "Love", "Programmers."};
		System.out.println(Arrays.toString(solution(strlist)));
	}
	
    public static int[] solution(String[] strlist) {
    	 return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
	
}
