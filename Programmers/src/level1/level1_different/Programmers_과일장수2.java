package level1.level1_different;

import java.util.Arrays;
import java.util.Collections;

public class Programmers_과일장수2 {
	public static void main(String[] args) {
		int k = 4;
		int m = 3;
		int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2 };
		System.out.println(solution(k, m, score));
	}

	public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i=0; i<arr.length;i++){
            if(i<(m*(arr.length/m))){
                if(i%m==m-1){
                    answer+=arr[i]*m;
                }
            }
        }
        return answer;
	}
}
