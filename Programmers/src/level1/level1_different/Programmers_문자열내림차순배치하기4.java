package level1.level1_different;

import java.util.Arrays;

public class Programmers_문자열내림차순배치하기4 {
	public static void main(String[] args) {
		String s = "Zbciefg";
		System.out.println(solution(s));
	}
    public static String solution(String s){
        char[] ch = s.toCharArray();
    Arrays.sort(ch);
    StringBuilder st = new StringBuilder(String.valueOf(ch));
    st.reverse();
    return  st.toString();
}
}
