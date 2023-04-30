package level0.stream;

import java.util.Arrays;

public class Programmers_문자열계산하기 {
	public static void main(String[] args) {
		String my_string = "13 - 500 - 200";
		System.out.println(solution(my_string));
	}

	public static int solution(String my_string) {
		 return Arrays.stream(my_string.replaceAll("- ", "-").replaceAll("[+] ", "").trim().split(" ")).mapToInt(Integer::parseInt).sum();
	}
}
