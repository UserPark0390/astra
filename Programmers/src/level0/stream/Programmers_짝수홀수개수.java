package level0.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Programmers_짝수홀수개수 {
	// 스트림 공부해서 연습하기
	public int[] solution(int[] numList) {
		return IntStream.of((int) Arrays.stream(numList).filter(i -> i % 2 == 0).count(),
				(int) Arrays.stream(numList).filter(i -> i % 2 == 1).count()).toArray();
	}

}
