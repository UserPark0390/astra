package level1.level1_solution;

public class Programmers_서울에서김서방찾기 {
	public static void main(String[] args) {
		String[] seoul = { "Jane", "Kim" };
		System.out.println(solution(seoul));
	}

	public static String solution(String[] seoul) {
		String answer = "";
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + String.valueOf(i) + "에 있다";
			}
		}
		return answer;
	}
}
