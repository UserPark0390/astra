package level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Programmers_아이스아메리카노 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(Arrays.toString(solution(sc.nextInt())));
	}
	public static int [] solution(int money) {
		Collections.reverse(null);
		return new int [] {money/5500, money % 5500};
	}
	
}
