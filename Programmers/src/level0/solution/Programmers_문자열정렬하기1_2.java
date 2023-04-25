package level0.solution;

import java.util.Arrays;

public class Programmers_문자열정렬하기1_2 {
	public static void main(String[] args) {
		String my_string = "p2o4i8gj2";
		System.out.println(Arrays.toString(solution(my_string)));
	}

	public static int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]","");

        int[] answer = new int[my_string.length()];

        for(int i =0; i<my_string.length(); i++){
            answer[i] = my_string.charAt(i) - '0';
        }

        Arrays.sort(answer);

        return answer;
	}
}
