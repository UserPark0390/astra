package level1.level1_different;

import java.util.Arrays;

public class Programmers_최대공약수와최소공배수 {
	public static void main(String[] args) {
		int n = 2;
		int m = 5;
		System.out.println(Arrays.toString(solution(n, m)));
	}
	
    public static int[] solution(int n, int m) {    	
    	int GCD = getGCD(Math.min(n, m), Math.max(n, m));
        return new int[] {GCD, (n * m) / GCD};
    }
    
    public static int getGCD(int small, int big) {
        return big % small != 0 ? getGCD(big % small, small) : small;
    }
}
