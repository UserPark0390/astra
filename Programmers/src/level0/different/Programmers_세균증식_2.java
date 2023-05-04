package level0.different;

public class Programmers_세균증식_2 {
	public static void main(String[] args) {
		int n = 7; 
		int t = 15;
		System.out.println(solution(n, t));
	}
	
    public static int solution(int n, int t) {
        int answer = n * (int)Math.pow(2,t);
        return answer;
    }
}
