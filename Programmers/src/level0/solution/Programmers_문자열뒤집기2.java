package level0.solution;

import java.util.Scanner;

public class Programmers_문자열뒤집기2 {
	
	static String my_string = "";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		my_string = sc.next();
		System.out.println(solution(my_string));		
	}
	
    public static String solution(String my_string) {
    	String answer = "";
    	for(int i = 0; i < my_string.length(); i++) {
    		answer += my_string.charAt(my_string.length()-1-i);
    	} 	
        return answer;
    }
}
