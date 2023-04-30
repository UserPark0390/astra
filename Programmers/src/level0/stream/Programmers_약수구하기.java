package level0.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Programmers_약수구하기 {

	public static void main(String[] args) {
		int n = 24;
		System.out.println(Arrays.toString((solution(n))));
		
	}
	
    public static int[] solution(int n) {        
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }
	
}
