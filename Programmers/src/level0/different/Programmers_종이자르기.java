package level0.different;

public class Programmers_종이자르기 {
	public static void main(String[] args) {
		int M = 2;
		int N = 2;
		System.out.println(solution(M,N));
	}
	
    public static int solution(int M, int N) {
    	return M - 1 + (N - 1 ) * M;
    }
}
