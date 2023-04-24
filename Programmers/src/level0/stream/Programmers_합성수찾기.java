package level0.stream;

import java.util.stream.IntStream;

public class Programmers_합성수찾기 {

	public static void main(String[] args) {
		int n = 15;
		System.out.println(solution(n));
	}
	
    public static int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> (int) IntStream.rangeClosed(1, i).filter(i2 -> i % i2 == 0).count() > 2).count();
    }
	
}
