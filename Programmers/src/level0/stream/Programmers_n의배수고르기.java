package level0.stream;

import java.util.*;

public class Programmers_n의배수고르기 {
	public static void main(String[] args) {
		int n = 3;
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12}; 
		System.out.println(Arrays.toString(solution(n, numlist)));		
	}
	
    public static int[] solution(int n, int[] numlist) {
    	return Arrays.stream(numlist).filter(value -> value % n == 0).toArray();
    }
}
