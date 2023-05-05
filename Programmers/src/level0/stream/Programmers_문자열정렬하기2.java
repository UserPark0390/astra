package level0.stream;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class Programmers_문자열정렬하기2 {
	public static void main(String[] args) {
		String my_string = "Bcad";
		System.out.println(solution(my_string));
	}
	
    public static String solution(String my_string) {
    	 return Arrays.stream(my_string.toLowerCase(Locale.ROOT).split("")).sorted().collect(Collectors.joining());
    }
	
}
