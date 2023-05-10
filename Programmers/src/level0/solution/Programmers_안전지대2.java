package level0.solution;

public class Programmers_안전지대2 {
	public static void main(String[] args) {
		int[][] board = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1 } };

//		{ { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 },
//			{ 0, 0, 0, 0, 0 } };
		System.out.println(solution(board));
	}

	public static int solution(int[][] board) {
		int answer = 0;
		int length = board.length; // 길이
		int[][] temp = new int[length + 2][length + 2];
		// 길이를 2 늘린 액자용 배열 생성 -> 이러면 단순한 조건식으로 안전영역 구할 수 있음

		// 액자에 board 이식.
		for (int i = 1; i < length + 1; i++) {
			for (int j = 1; j < length + 1; j++) {
				temp[i][j] = board[i - 1][j - 1];
			}
		}

		// 위험지대 찾기
		for (int i = 1; i < length + 1; i++) {
			for (int j = 1; j < length + 1; j++) {
				if (temp[i][j] == 1) {
					for (int a = i - 1; a <= i + 1; a++) {
						for (int b = j - 1; b <= j + 1; b++) {
							if (temp[a][b] != 1)
								temp[a][b] = 2;
						}
					}
				}
			}
		}

		// 안전지대 카운트
		for (int i = 1; i < length + 1; i++) {
			for (int j = 1; j < length + 1; j++) {
				if (temp[i][j] == 0)
					answer++;
				System.out.print(temp[i][j]);
			}
			System.out.println("");
		}
		return answer;
	}
}
