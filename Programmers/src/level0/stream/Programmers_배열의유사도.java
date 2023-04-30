package level0.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Programmers_배열의유사도 {
	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		System.out.println(solution(s1, s2));
	}
    public static int solution(String[] s1, String[] s2) {
    	 return (int) Arrays.stream(s1).map(s -> Arrays.stream(s2).collect(Collectors.toList()).contains(s)).filter(b -> b).count();
    }
}
