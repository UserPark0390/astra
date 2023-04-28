package level0.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Programmers_인덱스바꾸기 {
	public static void main(String[] args) {
		String my_string = "I love you";
		int num1 = 3;
		int num2 = 6;
		System.out.println(solution(my_string, num1, num2));
	}

	public static String solution(String myString, int num1, int num2) {
		List<String> list = Arrays.stream(myString.split("")).collect(Collectors.toList());

		Collections.swap(list, num1, num2);
		return String.join("", list);
	}
}
