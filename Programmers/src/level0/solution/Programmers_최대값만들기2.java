package level0.solution;

public class Programmers_최대값만들기2 {
	public static void main(String[] args) {
		int[] numbers = { -1, 1 };
		System.out.println(solution(numbers));
	}

	public static int solution(int[] numbers) {
		int answer = 0;
		int tmp = 0;
		boolean check = false;
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if ((numbers[i] < 0 && numbers[j] < 0) || (numbers[i] > 0 && numbers[j] > 0)) {
					tmp = Math.abs(numbers[i] * numbers[j]);
				} else {
					tmp = numbers[i] * numbers[j];
				}
				if (answer < tmp) {
					answer = tmp;
				} else if(answer == 0 && !check) {
					answer = tmp;
				}
			}
			check = true;
		}
		
		return answer;
	}

}
