package level0.different;

public class Programmers_인덱스바꾸기 {
	public static void main(String[] args) {
		String my_string = "I love you";
		int num1 = 3;
		int num2 = 6;
		System.out.println(solution(my_string, num1, num2));
	}

	public static String solution(String my_string, int num1, int num2) {
        String answer = "";

        char[] ch = my_string.toCharArray();

        ch[num1] = my_string.charAt(num2);
        ch[num2] = my_string.charAt(num1);

        answer = String.valueOf(ch);
        return answer;
    }
}
