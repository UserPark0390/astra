package level0.different;

public class Programmers_세균증식_1 {
	public static void main(String[] args) {
		int n = 7; 
		int t = 15;
		System.out.println(solution(n, t));
	}
	
    public static int solution(int n, int t) {
        int answer = 0;

        answer = n << t;

        return answer;
    }
}
