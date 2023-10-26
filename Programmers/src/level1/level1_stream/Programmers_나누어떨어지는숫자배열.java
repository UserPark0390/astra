package level1.level1_stream;

import java.util.Arrays;

public class Programmers_나누어떨어지는숫자배열 {
	public static void main(String[] args) {
		int[] arr = {2, 36, 1, 3};
		int divisor = 1;
		System.out.println(Arrays.toString(solution(arr, divisor)));
	}
	
    public static int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        if(answer.length == 0) answer = new int[] {-1};
        java.util.Arrays.sort(answer);
        return answer;
    }
}
