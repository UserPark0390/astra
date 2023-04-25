package level0.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_배열자르기2 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		int num1 = 1;
		int num2 = 3; 
		System.out.println(Arrays.toString(solution(numbers, num1, num2)));
	}
	
    public static int[] solution(int[] numbers, int num1, int num2) {
    	boolean check = false;
    	List<Integer>list = new ArrayList<>();
    	for(int i = 0; i < numbers.length; i++) {
    		if(i == num1) {
    			list.add(numbers[i]);
    			check = true;
    			continue;
    		} else if(i == num2) {
    			list.add(numbers[i]);
    			check = false;
    		}
    		if(check) {
    			list.add(numbers[i]);
    		}
    	}
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        // 아래와 같이 쓸 경우 answer에 값을 별도 지정 안 하고 사용할 수 있다. 
//        int[] answer = {};
//
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        for (int i = num1; i <= num2; i++) {
//            list.add(numbers[i]);
//        }
//
//        answer = list.stream()
//                .mapToInt(Integer::intValue)
//                .toArray();
        
        return answer;
    }
	
}
