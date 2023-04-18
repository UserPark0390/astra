package level0;

public class Programmers_가위바위보 {
	public static void main(String[] args) {
		String rsp = "205";
		System.out.println(solution(rsp));
	}
	
    public static String solution(String rsp) {
        String answer = "";
        for(int i = 0; i < rsp.length(); i++) {
        	char ch = rsp.charAt(i);
        	if(ch == '0') {
        		answer += "5";
        	} else if(ch == '2') {
        		answer += "0";
        	} else {
        		answer += "2";
        	}
        }
        return answer;
    }
}
