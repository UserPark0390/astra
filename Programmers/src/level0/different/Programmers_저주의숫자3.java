package level0.different;

public class Programmers_저주의숫자3 {
	public static void main(String[] args) {
		int n = 100;
		System.out.println(solution(n));
	}

	public static int solution(int n) {
	       int answer = 0;

	        for (int i = 1; i <= n; i++) {
	            answer++;
	            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
	                i--;
	            }
	        }

	        return answer;
	    }
}
