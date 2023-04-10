package level0;

import java.util.Arrays;
import java.util.Scanner;

public class Programmers_아이스아메리카노2 {
	static int[] answer = new int [2];
	static int money;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		solution(sc.nextInt());
	}
	public static int [] solution(int money) {
		int buy = 0;
		int remain = 0;
		buy = money / 5500;
		remain = money - (buy * 5500); 		
		answer[0] = buy; 
		answer[1] = remain;
		System.out.println(Arrays.toString(answer));
		return answer;
	}
	
}
