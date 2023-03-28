package Broze;

import java.util.Scanner;

public class BackJoon19532_수학은비대면강의입니다3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		int x = 0;
		int y = 0;

		for (int i = -999; i < 1000; i++) {
			for (int j = -999; j < 1000; j++) {
				if(a*i+b*j==c && d*i+e*j==f) {
					System.out.println(i+" "+j);
					System.exit(0);
				}
			}
		}		
	}
}
