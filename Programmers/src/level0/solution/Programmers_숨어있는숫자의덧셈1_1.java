package level0.solution;

public class Programmers_숨어있는숫자의덧셈1_1 {
	public static void main(String [] args) {
		String my_string = "1a2b3c4d123";
		System.out.println(solution(my_string));
	}
	
    public static int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[^0-9]","");

        for(char ch : str.toCharArray()) {
            answer += Character.getNumericValue(ch);
        }

        return answer;
    }
}
