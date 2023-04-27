package level0.stream;

import java.util.stream.Collectors;

public class Programmers_대문자와소문자 {
	public static void main(String[] args) {
		String my_string = "cccCCC";
		System.out.println(solution(my_string));
	}
	
    public static String solution(String my_string) {
    	 return my_string.chars().mapToObj(operand -> String.valueOf((char) (Character.isLowerCase(operand) ? Character.toUpperCase(operand) : Character.toLowerCase(operand)))).collect(Collectors.joining());
    }
}
