package level1.level1_solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Programmers_문자열내마음대로정렬하기 {
	public static void main(String[] args) {
		String[] strings = {"btd", "bed", "car"};
		int n = 1;
		System.out.println(Arrays.toString(solution(strings, n)));
	}
	
    public static String[] solution(String[] strings, int n) {
    	String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }
}
