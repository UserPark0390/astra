package level1.level1_solution;

import java.util.Arrays;

public class Programmers_자연수뒤집어배열로만들기 {
	public static void main(String[] args) {
		long n = 123456789;
		System.out.println(Arrays.toString(solution(n)));
	}
	
    public static int[] solution(long n) {
    	String n_str = String.valueOf(n);
        int[] answer = new int [n_str.length()];
        int count = 0;
        for(int i = n_str.length()-1; i >= 0; i--) {
        	answer[count] = n_str.charAt(i)-'0';
        	count++;
        }
        return answer;
    }
}
