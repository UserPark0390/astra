package level0.stream;

import java.util.Arrays;

public class Programmers_369게임 {

	public static void main(String[] args) {
		int order = 3;
		System.out.println(solution(order));
	}
    public static int solution(int order) {
    	  return (int) Arrays.stream(String.valueOf(order).split("")).map(Integer::parseInt).filter(i -> i == 3 || i == 6 || i == 9).count();
    }
	
}
