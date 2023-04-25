package level0.solution;

import java.util.Arrays;
import java.util.Scanner;

public class Programmers_배열뒤집기 {
	static int [] num_list = new int[5];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			num_list[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(solution(num_list)));		
	}
    public static int[] solution(int[] num_list) {
    	int[] answer = new int [num_list.length];
        for(int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[num_list.length - i -1];			
		}
        return answer;
    }
}
