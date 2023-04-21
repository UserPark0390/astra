package level0;

public class Programmers_공던지기2 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};
		int k = 3;
		System.out.println(solution(numbers, k));
	}

	public static int solution(int[] numbers, int k) {
		return (k-1)*2 % numbers.length+1;
	}

}
