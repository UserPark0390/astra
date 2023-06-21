package level0.different;

import java.util.Arrays;

public class Programmers_A로B만들기2 {
	public static void main(String[] args) {
		String before = "allpe";
		String after = "apple";
		System.out.println(solution(before, after));
	}

	public static int solution(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b)) ? 1 :0;
	}
} // char 정렬
