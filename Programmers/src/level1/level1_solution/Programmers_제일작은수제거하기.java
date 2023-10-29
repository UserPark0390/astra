package level1.level1_solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_제일작은수제거하기 {
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		System.out.println(Arrays.toString(solution(arr)));				
	}
	
    public static int[] solution(int[] arr) {
    	int [] answer = {};
    	int target = 0;
    	int tmp = 0;
    	List<Integer> list = new ArrayList<>();
    	for(int i = 0; i < arr.length; i++) {
    		if(i == 0) {
    			tmp = arr[i];
    		} else {
    			if(tmp >= arr[i]) {
    				target = i;
    				tmp = arr[i];
    			}
    		}    		
    		list.add(arr[i]);
    	}
    	list.remove(target);  
    	
    	
    	if(list.size() >= 1) {    		   
            answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++) {
            	answer[i] = list.get(i);
            }               
    	} else {
//    		answer = new int [1];
//    		answer[0] = -1;
    		answer = new int[]{-1};
    	}
    	return answer;
    }
}
