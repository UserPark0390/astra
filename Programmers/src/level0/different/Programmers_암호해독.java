package level0.different;

public class Programmers_암호해독 {
	public static void main(String[] args) {
		String cipher = "pfqallllabwaoclk";
		int code = 2;
		System.out.println(solution(cipher, code));
	}
	
    public static String solution(String cipher, int code) {
        String answer = "";
        for(int i=code-1; i<cipher.length(); i+=code){
            answer += cipher.substring(i, i+1);
        }
        return answer;
    }
}
