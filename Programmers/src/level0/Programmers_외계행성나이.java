package level0;

public class Programmers_외계행성나이 {

	public static void main(String[] args) {
		int age = 100;
		System.out.println(solution(age));
	}

	public static String solution(int age) {
		String answer = "";
		String tmp = String.valueOf(age);
		char ch = ' ';
		for (int i = 0; i < tmp.length(); i++) {
			switch (tmp.charAt(i)) {
			case '0':
				ch = 'a';
				answer += Character.toString(ch);
				break;
			case '1':
				ch = 'b';
				answer += Character.toString(ch);
				break;
			case '2':
				ch = 'c';
				answer += Character.toString(ch);
				break;
			case '3':
				ch = 'd';
				answer += Character.toString(ch);
				break;
			case '4':
				ch = 'e';
				answer += Character.toString(ch);
				break;
			case '5':
				ch = 'f';
				answer += Character.toString(ch);
				break;
			case '6':
				ch = 'g';
				answer += Character.toString(ch);
				break;
			case '7':
				ch = 'h';
				answer += Character.toString(ch);
				break;
			case '8':
				ch = 'i';
				answer += Character.toString(ch);
				break;
			case '9':
				ch = 'j';
				answer += Character.toString(ch);
				break;
			}
		}

		return answer;
	}
}
