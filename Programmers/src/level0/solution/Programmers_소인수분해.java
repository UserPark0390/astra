package level0.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Programmers_소인수분해 {
	public static void main(String[] args) {
		int n = 12;
		System.out.println(Arrays.toString(solution(n)));
	}
	
    public static int[] solution(int n) {
    	List<Integer> list = new ArrayList<>();
    	while(n > 1) {
    		for(int i = 2; i <= n; i++) {
    			if(n % i == 0) {
    				list.add(i);
    				n = n/i;
    				break;
    			}    			
    		}    		
    	}
    	list = list.stream().distinct().collect(Collectors.toList());
    	int[] answer = new int[list.size()];	
    	for(int j = 0; j < list.size(); j++) {
    			answer[j] = list.get(j);  		
    	}
    	
        return answer;
    }
	
}
