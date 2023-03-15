package Broze;

import java.util.Scanner;

public class BackJoon10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		String str_reverse = sb.reverse().toString();
		
		if(str.equals(str_reverse)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}	
	}
}
