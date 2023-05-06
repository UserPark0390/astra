package level0.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Programmers_7의개수 {
	public static void main(String[] args) {
		int[] array = {10, 29};
		System.out.println(solution(array));
	}

	public static int solution(int[] array) {
        return (int) Arrays.stream(
                Arrays.stream(array)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining())
                        .split("")
        )
        .filter(s -> s.equals("7"))
        .count();
	}

}
