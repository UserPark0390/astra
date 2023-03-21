package level0;


public class Programmers_배열의평균값 {
	public double solution(int[] numbers) {		
		int count = 0;
		double answer = 0;
		
		for(int i =0; i < numbers.length; i++) {
			answer += numbers[i];
			count++;
		}
		answer = answer/count;
		
		// 문자열쪽 공부하기
		// return Arrays.stream(numbers).average().orElse(0);
		return answer;	
	}
}
