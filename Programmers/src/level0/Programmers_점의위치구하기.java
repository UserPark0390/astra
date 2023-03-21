package level0;

public class Programmers_점의위치구하기 {
	public int solution(int[] dot) {
		int answer = 0;
		for (int i = 0; i < dot.length; i++) {
			if (i == 0) {
				if (dot[i] >= 0) {
					answer = 1;
				} else {
					answer = 2;
				}
			} else {
				if (dot[i] <= 0) {
					if (answer == 1) {
						answer = 4;
					} else {
						answer = 3;
					}
				}
			}
		}
		return answer;
	}
}
