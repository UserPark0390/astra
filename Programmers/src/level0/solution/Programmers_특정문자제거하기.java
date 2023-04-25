package level0.solution;

import java.util.Scanner;

public class Programmers_특정문자제거하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		String letter = sc.next();
		System.out.println(solution(my_string, letter));
	}

	public static String solution(String my_string, String letter) {
		return my_string.replace(letter, "");
	}
}
