package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_같은숫자는싫어 {
	public static void main(String[] args) {
		int [] arr = {1,1,3,3,0,1,1};
		System.out.println(Arrays.toString(solution(arr)));
	}
	
    public static int[] solution(int []arr) {
        int[] answer = {};
        int count = 0;
        List<Integer> list = new ArrayList();
        for(int i = 0; i < arr.length; i++) {
        	if(list.isEmpty()) {
        		list.add(arr[i]);
        		count = i;
        		continue;
        	}
        	if(list.get(count) != arr[i]) {
        		list.add(arr[i]);
        		count++;
        	}
        }
        answer = new int [list.size()];
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
	
}	
