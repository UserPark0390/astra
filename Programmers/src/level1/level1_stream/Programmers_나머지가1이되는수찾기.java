package level1.level1_stream;

import java.util.stream.IntStream;

public class Programmers_나머지가1이되는수찾기 {
	public static void main(String[] args) {
		int n = 12;
		System.out.println(solution(n));
	}

    public static int solution(int n) {
    	return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
    }
}
