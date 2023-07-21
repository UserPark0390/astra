package level1.level1_different;

public class Programmers_문자열다루기기본2 {
	public static void main(String[] args) {
		//String s = "9076ab1234";
		String s = "12451a";
		System.out.println(solution(s));
	}
    public static boolean solution(String s) {
    	return (s.length() != 4 && s.length() != 6) || (s.split("[0-9]").length > 0) ? false:true;
    }
}
