package level1.level1_stream;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Programmers_음양더하기 {

	public static void main(String[] args) {
		int [] absolutes = {1,2,3};
		boolean [] signs = {false,false,true};
		System.out.println(solution(absolutes, signs));
	}
	
    public static int solution(int[] absolutes, boolean[] signs) {
        AtomicInteger index = new AtomicInteger();
        return Arrays.stream(absolutes).reduce(0, (i, i1) -> {
            index.getAndIncrement();
            return signs[index.get() - 1] ? i + i1 : i - i1;
        });
    }
}
