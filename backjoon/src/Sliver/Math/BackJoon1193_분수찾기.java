package Sliver.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon1193_분수찾기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int change_line = 1; // 대각선 변화 1/2 2/1 = 두개의 합은 3 밑으로 감 // 1/3 2/2 3/1 = 두개의합은 4 위로향한다
		int line_count = 0; // 카운팅

		while (true) {
			// 직전 대각선 누적합 + 대각선 개수로 범위 체크
			if (X <= change_line + line_count) {
				// 대각선의 개수가 홀수라면
				if (change_line % 2 == 1) {
					// 분자가 큰 수부터 시작
					// 분자는 대각선상 내의 블록 개수 - (X 번째 - 직전 대각선까지의 블럭개수 -1)
					// 분모는 X번째 - 직전 대각선까지의 블럭 개수
					System.out.println((change_line - (X - line_count - 1)) + "/" + (X - line_count));
					break;
				} else { // 대각선 개수가 짝수라면 홀수랑 반대로 출력
					System.out.println((X - line_count) + "/" + (change_line - (X - line_count - 1)));
					break;
				}
			} else { 
				line_count += change_line;
				change_line++;
			}
		}

	}
}
