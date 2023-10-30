package level1.level1_solution;

public class Programmers_가운데글자가져오기 {
	public static void main(String[] args) {
		String s = "qwer";
		System.out.println(solution(s));
	}
    public static String solution(String s) {
    	boolean check = false;
        String answer = "";
        check = s.length() % 2 == 0 ? true : false;     
        answer = check == true ? (s.charAt((s.length()/2)-1)+"") + (s.charAt(s.length()/2)+"") : s.charAt(s.length()/2)+"";
        return answer;
    }
	
}
