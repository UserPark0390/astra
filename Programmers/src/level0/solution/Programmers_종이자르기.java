package level0.solution;

public class Programmers_종이자르기 {
	public static void main(String[] args) {
		int M = 2;
		int N = 2;
		System.out.println(solution(M,N));
	}
	
    public static int solution(int M, int N) {
        int answer = 0;
        int tmp = M*N;
        if(M*N -1 == 0) {
        	answer = 0;
        } else {
        	answer = M*N -1;
        }
        
        return answer;
    }
}
