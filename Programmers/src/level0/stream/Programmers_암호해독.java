package level0.stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Programmers_암호해독 {
	public static void main(String[] args) {
		String cipher = "pfqallllabwaoclk";
		int code = 2;
		System.out.println(solution(cipher, code));
	}
	
    public static String solution(String cipher, int code) {
    	 return IntStream.range(0, cipher.length())
                 .filter(value -> value % code == code - 1)
                 .mapToObj(c -> String.valueOf(cipher.charAt(c)))
                 .collect(Collectors.joining());
     }
}
