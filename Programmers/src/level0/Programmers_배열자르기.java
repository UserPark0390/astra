package level0;

import java.util.Arrays;

public class Programmers_배열자르기 {
	public static void main(String[] args) {
		int[] numbers = {1, 3, 5};
		int num1 = 0;
		int num2 = 2; 
		System.out.println(Arrays.toString(solution(numbers, num1, num2)));
	}
	
    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2];

        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
	
}
