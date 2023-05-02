package level0.stream;

import java.util.Arrays;

public class Programmers_자릿수더하기 {
	public static void main(String[] args) {
		int n = 930211;
		System.out.println(solution(n));
	}
    public static int solution(int n) {
    	return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
	
}
