package Broze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A[] = br.readLine().split("");
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			char ch = A[i].charAt(0);
			if (65 <= (int) ch && (int) ch <= 67) { // 입력한 단어의 아스키코드값에 따라 다이얼 번호 체크
				result += 3;
			} else if (68 <= (int) ch && (int) ch <= 70) {
				result += 4;
			} else if (71 <= (int) ch && (int) ch <= 73) {
				result += 5;
			} else if (74 <= (int) ch && (int) ch <= 76) {
				result += 6;
			} else if (77 <= (int) ch && (int) ch <= 79) {
				result += 7;
			} else if (80 <= (int) ch && (int) ch <= 83) {
				result += 8;
			} else if (84 <= (int) ch && (int) ch <= 86) {
				result += 9;
			} else if (87 <= (int) ch && (int) ch <= 90) {
				result += 10;
			}
		}
		System.out.println(result);
	}
}
