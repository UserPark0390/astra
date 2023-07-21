package level1.level1_stream;

import java.util.Collections;

public class Programmers_문자열내림차순배치하기 {
	public static void main(String[] args) {
		String s = "Zbciefg";
		System.out.println(solution(s));
	}
    public static String solution(String s) {
    	 return s.chars().boxed().sorted(Collections.reverseOrder()).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
