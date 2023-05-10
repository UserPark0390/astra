package level0.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Programmers_외계어사전 {
	public static void main(String[] args) {
		String[] spell = { "z", "d", "x" };
		String[] dic = { "def", "dww", "dzx", "loveaw" };
		System.out.println(solution(spell, dic));
	}

	public static int solution(String[] spell, String[] dic) {
		return Arrays.stream(dic)
				.map(s -> s.chars().sorted().mapToObj(i -> String.valueOf((char) i)).collect(Collectors.joining()))
				.collect(Collectors.toList()).contains(Arrays.stream(spell).sorted().collect(Collectors.joining())) ? 1
						: 2;
	}

}
