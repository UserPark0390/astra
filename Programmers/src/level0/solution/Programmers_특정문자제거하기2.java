package level0.solution;

import java.util.Scanner;

public class Programmers_특정문자제거하기2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		String letter = sc.next();
		System.out.println(solution(my_string, letter));
	}
	
    public static String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++){
        	char ch = my_string.charAt(i); 
            if(!Character.toString(ch).equals(letter)){
                sb.append(Character.toString(ch));
            }
        }        
        return sb.toString();
    }
}
