package level0.solution;

public class Programmers_숨어있는숫자의덧셈1_2 {
	public static void main(String [] args) {
		String my_string = "1a2b3c4d123";
		System.out.println(solution(my_string));
	}
	
    public static int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-z]", "");
        my_string = my_string.replaceAll("[A-Z]", "");
        for(int i = 0; i < my_string.length(); i++) {
        	answer += my_string.charAt(i)-'0';
        }
        
        return answer;
    }
}
