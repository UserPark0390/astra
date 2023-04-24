package level0;

import java.util.Arrays;

public class Programmers_최대값만들기1 {
	public static void main(String[] args) {
		int [] numbers = {1, 2, 3, 4, 5};
		System.out.println(solution(numbers));
	}
	
    public static int solution(int[] numbers) {
    	// 1번째 방법 : 2중 for문으로 완전탐색
        int answer = 0;
        for(int i = 0; i < numbers.length-1; i++) {
        	for(int j = i+1; j < numbers.length; j++) {
        		if(answer <= numbers[i] * numbers[j]) {
        			answer = numbers[i] * numbers[j];
        		}
        	}
        }
        return answer;
        // 2번째 방법 : 정렬 후 가장 큰 숫자 2개를 곱
//        Arrays.sort(numbers);
//
//        return numbers[numbers.length-1]*numbers[numbers.length-2];
    }
}
