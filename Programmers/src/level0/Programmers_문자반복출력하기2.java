package level0;

public class Programmers_문자반복출력하기2 {
	// 확장 for 문 공부
	public String solution(String my_string, int n) {
		StringBuilder sb = new StringBuilder();
		for (char c : my_string.toCharArray()) {
			sb.append((c + "").repeat(n));
		}
		return sb.toString();
	}
}
