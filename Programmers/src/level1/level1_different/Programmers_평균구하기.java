package level1.level1_different;

public class Programmers_평균구하기 {
	public static void main(String[] args) {
		int[] arr = { 5, 5 };
		System.out.println(solution(arr));
	}

	public static double solution(int[] arr) {
		double answer = 0;
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
			if (arr.length - 1 == i) {
				answer = answer / arr.length;
			}
		}
		return answer;
	}
}
