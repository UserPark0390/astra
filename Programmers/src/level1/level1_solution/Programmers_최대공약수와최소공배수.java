package level1.level1_solution;

import java.util.Arrays;

public class Programmers_최대공약수와최소공배수 {
	public static void main(String[] args) {
		int n = 2;
		int m = 5;
		System.out.println(Arrays.toString(solution(n, m)));
	}
	
    public static int[] solution(int n, int m) {    	
        int[] answer = {gcd(n,m) , lcm(n,m)};
        return answer;
    }
    
    public static int gcd(int n, int m) {
    	if(m == 0) return n;
		return gcd(m, n%m);
    }
    
    public static int lcm(int n, int m) {
		return n*m / gcd(n,m);    	
    }  
}
