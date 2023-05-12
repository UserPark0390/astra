package level0.solution;

public class Programmers_유한소수판별하기 {
	public static void main(String[] args) {
		int a = 11;
		int b = 22;
		System.out.println(solution(a, b));
	}

	public static int solution(int a, int b) {
		int B = b / GCD(a,b);
		while(B != 1) {
			if(B % 2 == 0) {
				B /= 2;
			} else if(B % 5 == 0) {
				B /= 5;
			} else {
				return 2;
			}
		}		
		return 1;
	}

	private static int GCD(int a, int b) {
		if(b == 0) {
			return a;
		} else {
			return GCD(b, a%b);
		}
	}

}
