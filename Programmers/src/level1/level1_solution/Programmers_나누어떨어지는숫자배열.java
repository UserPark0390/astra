package level1.level1_solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programmers_나누어떨어지는숫자배열 {
	public static void main(String[] args) {
		int[] arr = {2, 36, 1, 3};
		int divisor = 1;
		System.out.println(Arrays.toString(solution(arr, divisor)));
	}
	
    public static int[] solution(int[] arr, int divisor) {
    	List<Integer> list = new ArrayList<>();
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i] % divisor == 0) {
    			list.add(arr[i]);
    		} else if(i+1 == arr.length && list.isEmpty()) {
    			list.add(-1);
    		}
    	} // for end
    	Collections.sort(list);
    	int[] answer = list.stream().mapToInt(i->i).toArray();        
        return answer;
    }
}
