package level0.stream;

import java.util.Arrays;

public class Programmers_OX퀴즈 {
	public static void main(String[] args) {
		String[] quiz = { "3 - 4 = -3", "5 + 6 = 11" };
		System.out.println(Arrays.toString(solution(quiz)));
	}

	public static String[] solution(String[] quiz) {
        return Arrays.stream(quiz).map(s -> {
            String[] arr = s.trim().split(" ");
            return arr[1].equals("+") && Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) || Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) ? "O" : "X";
        }).toArray(String[]::new);
	}
}
