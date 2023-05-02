package level0.solution;

public class Programmers_자릿수더하기 {
	public static void main(String[] args) {
		int n = 930211;
		System.out.println(solution(n));
	}
    public static int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        for(int i = 0; i < str.length(); i++) {
        	answer += str.charAt(i) - '0';
        }        
        return answer;
    }
	
}
