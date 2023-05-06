package level0.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Programmers_잘라서배열로저장하기 {
	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		System.out.println(Arrays.toString(solution(my_str, n)));
	}
	
    public static String[] solution(String my_str, int n) {
    	return IntStream.range(0, my_str.length() / n + (my_str.length() % n > 0 ? 1 : 0))
                .mapToObj(i -> i == my_str.length() / n ? my_str.substring(i * n) : my_str.substring(i * n, (i + 1) * n))
                .toArray(String[]::new);
    }
}
