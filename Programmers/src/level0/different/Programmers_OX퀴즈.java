package level0.different;

import java.util.Arrays;

public class Programmers_OX퀴즈 {
	public static void main(String[] args) {
		String[] quiz = { "3 - 4 = -3", "5 + 6 = 11" };
		System.out.println(Arrays.toString(solution(quiz)));
	}

	public static String[] solution(String[] quiz) {
        for(int i=0; i<quiz.length; i++){
            String[] text = quiz[i].split(" ");
            int result = Integer.parseInt(text[0]) + ( Integer.parseInt(text[2]) * ( text[1].equals("+") ? 1:-1) );
            quiz[i] = result == Integer.parseInt(text[4])? "O": "X";
        }
        return quiz;
	}
}
