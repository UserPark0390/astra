package level0.different;

public class Programmers_문자열안에문자열 {
	public static void main(String[] args) {
		String str1 = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CD";
		System.out.println(solution(str1, str2));
	}
    public static int solution(String str1, String str2) {
    	 return (str1.contains(str2) ? 1 : 2);
    }
	
}	
