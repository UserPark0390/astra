package level1.level1_solution;

public class Programmers_자릿수더하기 {
	public static void main(String[] args) {
		int n = 987;
		System.out.println(solution(n));
	}
	
    public static int solution(int n) {
        int answer = 0;
        String A = String.valueOf(n);
        for(int i = 0; i < A.length(); i++) {
        	answer += Integer.parseInt(A.charAt(i)+"");        			
        }

        return answer;
    }
}
