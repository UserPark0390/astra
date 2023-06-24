package level1.level1_stream;

import java.util.stream.LongStream;

public class Programmers_크기가작은부분문자열 {
	public static void main(String[] args) {
		String t = "3141592";
		String p = "271";
		System.out.println(solution(t, p));
	}
	
    public static int solution(String t, String p) {
    	  long targetNumber = Long.parseLong(p);
          int targetNumberLength = p.length();

          return (int) LongStream.range(0L, t.length() - targetNumberLength + 1L)
                  .mapToObj(i -> t.substring((int) i, (int) i + targetNumberLength))
                  .mapToLong(Long::parseLong)
                  .filter(number -> number <= targetNumber)
                  .count();
    }
}
