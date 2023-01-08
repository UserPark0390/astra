package Broze;

import java.util.Scanner;

public class BackJoon25501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt(); // 테스트 케이스
    	for(int i = 0; i < T; i++) {
    		count = 0;
    		sb.append(isPalindrome(sc.next()) + " " + count+ "\n");
    	}
    	System.out.println(sb);
    } // main end
		
	
	static int count = 0; // 호출 카운트  
	
	public static int recursion(String s, int l, int r) {
		count++; 
		if (l >= r)
			return 1;
		else if (s.charAt(l) != s.charAt(r)) 
			return 0;
		else
			return recursion(s, l + 1, r - 1);
	} // recursion end

	public static int isPalindrome(String s) { 
		return recursion(s, 0, s.length() - 1);
	} // isPalindrome end

}
