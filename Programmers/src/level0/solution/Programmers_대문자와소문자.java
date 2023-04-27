package level0.solution;

public class Programmers_대문자와소문자 {
	public static void main(String[] args) {
		String my_string = "cccCCC";
		System.out.println(solution(my_string));
	}
	
    public static String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
        	char ch = my_string.charAt(i);
        	if(ch >= 65 && ch <= 90) {
        		answer += Character.toString(ch+32);
        	} else {
        		answer += Character.toString(ch-32);
        	}
        }
        return answer;
    }
}
