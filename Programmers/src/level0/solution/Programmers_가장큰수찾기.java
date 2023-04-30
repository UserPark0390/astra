package level0.solution;

import java.util.Arrays;

public class Programmers_가장큰수찾기 {
	public static void main(String[] args) {
		int[] array = {1, 8, 3};
		System.out.println(Arrays.toString(solution(array)));		
	}

    public static int[] solution(int[] array) {
        int maxNum = 0;
        int index = 0;
        for(int i = 0; i < array.length; i++) {
        	if(maxNum < array[i]) {
        		maxNum = array[i];
        		index = i;
        	}
        }
        int[] answer = {maxNum, index};
        return answer;
    }

}
