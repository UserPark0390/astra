package level0.solution;

public class Programmers_인덱스바꾸기 {
	public static void main(String[] args) {
		String my_string = "I love you";
		int num1 = 3;
		int num2 = 6;
		System.out.println(solution(my_string, num1, num2));
	}
	
    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        char num1_char = ' ';
        char num2_char = ' ';
        for(int i = 0; i < my_string.length(); i++) {
        	if(num1 == i) {
        		num1_char = my_string.charAt(i);
        	} else if(num2 == i) {
        		num2_char = my_string.charAt(i);
        	}
        }       
        for(int i = 0; i < my_string.length(); i++) {
        	if(num1 == i) {
        		answer += num2_char;
        	} else if(num2 == i) {
        		answer += num1_char;
        	} else {
        		answer += my_string.charAt(i);
        	}
        }
        return answer;
    }
}
