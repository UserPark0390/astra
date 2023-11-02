package level1.level1_solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_없는숫자더하기 {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		System.out.println(solution(numbers));
	}
	
    public static int solution(int[] numbers) {
        int answer = 0;
        String [] check_number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        List <String> list = new ArrayList<String>(Arrays.asList(check_number));	
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = 0; j < list.size(); j++) {
        		if(list.get(j).equals(numbers[i]+"")) {
        			list.set(j, "-1");
        			break;
        		}
        	}
        }
        list.removeIf(n -> (n == "-1"));
        for(int k = 0; k < list.size(); k++) {
        	answer += Integer.parseInt(list.get(k));        			
        }
        return answer;
    }
	
}
 