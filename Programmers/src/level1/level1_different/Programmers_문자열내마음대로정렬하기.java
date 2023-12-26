package level1.level1_different;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers_문자열내마음대로정렬하기 {
	public static void main(String[] args) {
		String[] strings = {"btd", "bed", "car"};
		int n = 1;
		System.out.println(Arrays.toString(solution(strings, n)));
	}
	
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.charAt(n) > s2.charAt(n)) return 1;
                else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
                else if(s1.charAt(n) < s2.charAt(n)) return -1;
                else return 0;
            }
        });
        return strings;
    }
}
