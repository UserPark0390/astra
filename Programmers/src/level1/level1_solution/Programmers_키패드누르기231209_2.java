package level1.level1_solution;

public class Programmers_키패드누르기231209_2 {
	public static void main(String[] args) {
		int[] numbers = { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 };
		String hand = "left";
		System.out.println(solution(numbers, hand));
	}

	public static String solution(int[] numbers, String hand) {
		String answer = "";
		int left_Position = 10; // 왼쪽 손가락의 위치
		int right_Position = 12; // 오른쪽 손가락의 위치
		// hand에 따라서 같은 값의 경우 hand가 우선순위로 간다. if문으로 왼쪽 오른쪽 손가락을 체크 후
		// 왼쪽 손가락 기준으로 거리 비교를 삼항식으로 answer = left_distance >= right_distance ? 왼쪽 : 오른쪽
		// * : 10 / 0 : 11 / # : 12

		for (int i = 0; i < numbers.length; i++) {
			int left_distance = 0; // 왼쪽 손가락과 키패드 누르는 숫자와의 거리
			int right_distance = 0; // 오른쪽 손가락과 키패드 누르는 숫자와의 거리
			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				answer += "L";
				left_Position = numbers[i];
			} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				answer += "R";
				right_Position = numbers[i];
			} else {
				if (numbers[i] == 0) {
					numbers[i] = 11;
					if (hand.equals("left")) {
						left_distance = change(numbers[i], left_Position);
						right_distance = change(numbers[i], right_Position);
						if (left_distance > right_distance) {
							answer += "R";
							right_Position = numbers[i];
						} else {
							answer += "L";
							left_Position = numbers[i];
						}
					} else {
						if (hand.equals("right")) {
							left_distance = change(numbers[i], left_Position);
							right_distance = change(numbers[i], right_Position);
							if (left_distance < right_distance) {
								answer += "L";
								left_Position = numbers[i];
							} else {
								answer += "R";
								right_Position = numbers[i];
							}
						}
					}
				} else {
					if (hand.equals("left")) {
						left_distance = change(numbers[i], left_Position);
						right_distance = change(numbers[i], right_Position);
						if (left_distance > right_distance) {
							answer += "R";
							right_Position = numbers[i];
						} else {
							answer += "L";
							left_Position = numbers[i];
						}
					} else {
						if (hand.equals("right")) {
							left_distance = change(numbers[i], left_Position);
							right_distance = change(numbers[i], right_Position);
							if (left_distance < right_distance) {
								answer += "L";
								left_Position = numbers[i];
							} else {
								answer += "R";
								right_Position = numbers[i];
							}
						}
					}
				}

			}

		} // for end

		return answer;
	}

	private static int change(int distance, int position) {
		System.out.println("what the : " + distance);
		System.out.println("fuck : " + position);
		int sum = Math.abs(distance - position);
		if(Math.abs(distance - position) % 3 == 0) {
			distance = sum;
		} else {
			distance = sum/3 + 2;
		}
	
		if (sum >= 3) {
			distance = (int) (Math.floor(sum / 3) + 1);
		} else {
			distance = sum;
		}
		return distance;
	}
}
