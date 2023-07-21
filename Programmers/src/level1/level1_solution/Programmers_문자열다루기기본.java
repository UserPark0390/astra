package level1.level1_solution;

public class Programmers_문자열다루기기본 {
	public static void main(String[] args) {
		//String s = "9076ab1234";
		String s = "12451a";
		System.out.println(solution(s));
	}
    public static boolean solution(String s) {
        boolean answer = true;
        for(int i = 0; i < s.length(); i++) {
        	System.out.println("s의 길이 : " + s.length());
        	System.out.println(i + " : " + (s.charAt(i) -'0'));
        	if(s.length() == 4 || s.length() == 6) {
        		answer = true;
        	} else {
        		answer = false;
        	}
        	if(s.charAt(i)-'0' > 10) {
        		answer = false;
        		break;
        	}
        }   
        return answer;
    }
}
