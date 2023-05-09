package level0.solution;

import java.util.StringTokenizer;

public class Programmers_다항식더하기 {
	public static void main(String[] args) {
		String polynomial = "10x + x + 20x + 10 + 3x";
		System.out.println(solution(polynomial));

	}

	public static String solution(String polynomial) {
		String answer = "";
		StringTokenizer st = new StringTokenizer(polynomial, " ");
		int X = 0;
		int Y = 0;
		int size = st.countTokens();
		for (int i = 0; i < size; i++) {
			boolean checkX = false;
			int tmp = 0;
			String str_tmp = ""; // 두 자리수 이상
			String str = st.nextToken();
			for (int j = 0; j < str.length(); j++) {
				if (str.length() >= 2) {
					if (str.charAt(j) == 'x') {
						checkX = true;
						break;
					} else {
						str_tmp += Character.toString(str.charAt(j));
						continue;
					}
				}
				if (str.charAt(j) == 'x') {
					if (j == 0) {
						checkX = true;
						tmp++;
					} else {
						checkX = true;
					}
				} else if (str.charAt(j) == '+') {
					break;
				} else {
					tmp += str.charAt(j) - '0';
				}
			}
			if (checkX && str_tmp.length() > 0) {
				X += Integer.parseInt(str_tmp);
			} else if (!checkX && str_tmp.length() > 0) {
				Y += Integer.parseInt(str_tmp);
			} else if (checkX) {
				X += tmp;
			} else {
				Y += tmp;
			}
		}
		if ((X == 0 && Y >= 0) || (X == 0 && Y >= 0)) {
			return answer = String.valueOf(Y);
		} else if (X == 1 && Y == 0) {
			return answer = "x";
		} else if (X == 1 && Y > 0) {
			return answer = "x" + " + " + String.valueOf(Y);
		} else if (X > 1 && Y == 0) {
			return answer = String.valueOf(X) + "x";
		} else {
			return answer = String.valueOf(X) + "x" + " + " + String.valueOf(Y);
		}
	}

}
