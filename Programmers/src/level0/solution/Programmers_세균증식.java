package level0.solution;

public class Programmers_세균증식 {
	public static void main(String[] args) {
		int n = 7; 
		int t = 15;
		System.out.println(solution(n, t));
	}
	
    public static int solution(int n, int t) {
        int answer = 2;
        for(int i = 1; i <= t; i++) {        	
        	n = n * answer;
        }
        answer = n;
        return answer;
    }
}
