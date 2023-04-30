package level0.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Programmers_한번만등장한문자 {
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(solution(s));
	}

	public static String solution(String s) {
		return Arrays.stream(s.split("")).collect(Collectors.groupingBy(s1 -> s1)).entrySet().stream()
				.filter(entry -> entry.getValue().size() <= 1).map(Map.Entry::getKey).sorted()
				.collect(Collectors.joining());
	}

}
