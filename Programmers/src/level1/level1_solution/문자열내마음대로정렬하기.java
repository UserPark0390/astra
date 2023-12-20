package level1.level1_solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자열내마음대로정렬하기 {
	public static void main(String[] args) {
		String[] strings = {"btd", "bed", "car"};
		int n = 1;
		System.out.println(Arrays.toString(solution(strings, n)));
	}
	
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        List<String>list = new ArrayList<String>(Arrays.asList(strings));
        String[] answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}
