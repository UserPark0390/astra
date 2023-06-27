package level1.level1_stream;

import java.util.Arrays;
import java.util.stream.LongStream;

public class Programmers_X만큼간격이있는N개의숫자 {
	public static void main(String[] args) {
		int x = -4;
		int n = 5;
		System.out.println(Arrays.toString(solution(x, n)));
	}

	public static long[] solution(int x, int n) {
		return LongStream.iterate(x, i->i+x).limit(n).toArray();
	}
}
