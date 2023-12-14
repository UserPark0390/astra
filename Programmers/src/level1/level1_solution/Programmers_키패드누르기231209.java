package level1.level1_solution;

public class Programmers_키패드누르기231209 {
	public static void main(String[] args) {
		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "right";
		System.out.println(solution(numbers, hand));
	}

	public static String solution(int[] numbers, String hand) {
		String answer = "";
		// String[][] Phone = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" },
		// { "*", "0", "#" } };

		int left_distance = 0; // 숫자에서 왼쪽 손가락의 거리
		int right_distance = 0; // 숫자에서 오른쪽 손가락의 거리
		// hand에 따라서 같은 값의 경우 hand가 우선순위로 간다. if문으로 왼쪽 오른쪽 손가락을 체크 후
		// 왼쪽 손가락 기준으로 거리 비교를 삼항식으로 answer = left_distance >= right_distance ? 왼쪽 : 오른쪽

		for (int i = 0; i < numbers.length; i++) {
			int left_Before_distance = 0; // 이전의 왼쪽 손가락 위치 값
			int right_Before_distance = 0; // 이전의 오른쪽 손가락 위치 값
			if (hand.equals("left")) {
				if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
					answer += "L";
					left_distance = numbers[i];
				} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
					answer += "R";
					right_distance = numbers[i];
				} else {
					left_Before_distance = Math.abs(numbers[i] - left_distance);
					right_Before_distance = Math.abs(numbers[i] - right_distance);
					if (left_Before_distance > right_Before_distance) {
						answer += "R";
						right_distance = numbers[i];
					} else {
						answer += "L";
						left_distance = numbers[i];
					}
				}
			} else {
				if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
					answer += "L";
					left_distance = numbers[i];
				} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
					answer += "R";
					right_distance = numbers[i];
				} else {
					left_Before_distance = Math.abs(numbers[i] - left_distance);
					right_Before_distance = Math.abs(numbers[i] - right_distance);
					if (left_Before_distance < right_Before_distance) {
						answer += "L";
						left_distance = numbers[i];
					} else {
						answer += "R";
						right_distance = numbers[i];
					}
				}

			}

		}

		return answer;
	}
}
