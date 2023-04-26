package level0.stream;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Programmers_중복된문자 {
	public static void main(String[] args) {
		String my_string = "people";
		System.out.println(solution(my_string));
	}

    public static String solution(String my_string) {
    	 return Arrays.stream(my_string.split("")).distinct().collect(Collectors.joining());
    }
}
