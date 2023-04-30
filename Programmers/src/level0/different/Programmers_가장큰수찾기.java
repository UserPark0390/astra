package level0.different;

import java.util.Arrays;

public class Programmers_가장큰수찾기 {
	public static void main(String[] args) {
		int[] array = {1, 8, 3};
		System.out.println(Arrays.toString(solution(array)));		
	}

    public static int[] solution(int[] array) {
    	   int max = 0;
           int maxIndex = -1;
           for (int i = 0; i < array.length; i++) {
               if (max < array[i]) {
                   max = array[i];
                   maxIndex = i;
               }
           }
           int[] answer = {max, maxIndex};
           return answer;
       }

}
