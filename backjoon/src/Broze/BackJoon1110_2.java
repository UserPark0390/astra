package Broze;

import java.util.Scanner;

public class BackJoon1110_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int a, b , count = 0;
		int N_change = -1;  
		int tmp = N;
		
		while(N!=N_change) {
			a = tmp/10;
			b = tmp%10;
			N_change = ((b*10) + ((a+b) % 10)); 
			
			tmp = N_change;
			count++;
		}
		System.out.println(count);
	 
		
   }
}
