package level1.level1_solution;

public class Programmers_나머지가1이되는수찾기 {
	public static void main(String[] args) {
		int n = 12;
		System.out.println(solution(n));
	}
	
    public static int solution(int n) {
        int answer = 0;     
        for(int i = 2; i < n; i++) {
        	int tmp = 0;
        	if(n%i == 1) {
        		tmp = i;
        		if(answer == 0) {
        			answer = tmp;
        		} else if(answer > tmp) {
        			answer = tmp;
        		}
        	}
        }        
        return answer;
    }
}
