package level0;

public class Programmers_합성수찾기 {

	public static void main(String[] args) {
		int n = 15;
		System.out.println(solution(n));
	}
	
    public static int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++) {
        	int count = 0;
        	for(int j = 1; j <= i; j++) {
        		if(i % j == 0) {
        			count++;
        		}
        		if(count >= 3) {
        			answer++;
        			break;
        		}
        	}
        }
        return answer;
    }
	
}
