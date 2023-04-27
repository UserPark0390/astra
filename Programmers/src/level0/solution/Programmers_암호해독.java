package level0.solution;

public class Programmers_암호해독 {
	public static void main(String[] args) {
		String cipher = "pfqallllabwaoclk";
		int code = 2;
		System.out.println(solution(cipher, code));
	}
	
    public static String solution(String cipher, int code) {
        String answer = "";
        int check = code;
        for(int i = 0; i < cipher.length(); i++) {
        	if(check - 1 == i) {
        		check = check + code;
        		answer += cipher.charAt(i);
        	}
        }
        return answer;
    }
}
