package level1.level1_solution;

public class Programmers_p와y의개수 {
	public static void main(String[] args) {
		String s = "Pyy";
		System.out.println(solution(s));
	}
	
    static boolean solution(String s) {
        boolean answer = true;
        s = s.replaceAll("[p, P]", "1");
        s = s.replaceAll("[y, Y]", "0");
        s = s.replaceAll("[A-z]", "");
        int check_p = 0;
        int check_y = 0;
        for(int i = 0; i < s.length(); i++) {
        	if((s.charAt(i)+"").equals("1")) {
        		check_p++;
        	} else {
        		check_y++;
        	}
        }
        if(check_p != check_y) {
        	answer = false;
        }
  
        return answer;
    }
}
