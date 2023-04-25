package level0.solution;

import java.util.Scanner;

public class Programmers_문자열뒤집기 {
	
	static String my_string = "";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		my_string = sc.next();
		System.out.println(solution(my_string));		
	}
	
    public static String solution(String my_string) {
    	StringBuilder sb = new StringBuilder();
    	sb.append(my_string);
    	sb.reverse();
        return sb.toString();
    }
}
