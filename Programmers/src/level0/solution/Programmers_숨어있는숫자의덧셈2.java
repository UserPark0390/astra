package level0.solution;

public class Programmers_숨어있는숫자의덧셈2 {
	public static void main(String[] args) {
		String my_string = "1a2b3c4d123Z";
		System.out.println(solution(my_string));
	}

	public static int solution(String my_string) {
		int answer = 0;
		String tmp = "";
		String str = my_string.replaceAll("[^0-9]", "X");

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'X') {
				if (!tmp.isEmpty()) {
					answer += Integer.parseInt(tmp);
					tmp = "";
				}
			} else {
				tmp += Character.toString(str.charAt(i));
			}
		}
		if (!tmp.isEmpty()) {
			answer += Integer.parseInt(tmp);
		}
		return answer;
	}
}
