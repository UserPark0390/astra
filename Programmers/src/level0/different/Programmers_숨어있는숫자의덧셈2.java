package level0.different;

public class Programmers_숨어있는숫자의덧셈2 {
	public static void main(String[] args) {
		String my_string = "1a2b3c4d123Z";
		System.out.println(solution(my_string));
	}

	public static int solution(String my_string) {
		int answer = 0;
		String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
		for (String s : str) {
			if (!s.equals(""))
				answer += Integer.valueOf(s);
		}
		return answer;
	}
}
