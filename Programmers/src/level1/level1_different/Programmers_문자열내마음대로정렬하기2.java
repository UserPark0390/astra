package level1.level1_different;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers_문자열내마음대로정렬하기2 {
	public static void main(String[] args) {
		String[] strings = {"btd", "bed", "car"};
		int n = 1;
		System.out.println(Arrays.toString(solution(strings, n)));
	}
	
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        Arrays.sort(strings, Comparator.comparing((s) -> s.substring(n, n + 1)));
        return strings;
    }
}
