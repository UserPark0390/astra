package level0.solution;

import java.util.StringTokenizer;

public class Programmers_컨트롤제트 {
	public static void main(String[] args) {
		String s = "1 2 Z 3";
		System.out.println(solution(s));
	}
	
    public static int solution(String s) {
    	StringTokenizer st = new StringTokenizer(s);
    	int tmp = st.countTokens();
    	int answer = 0;
    	int beforeNum = 0;
    	for(int i = 0; i < tmp; i++) {
    		String str = st.nextToken();
    		if(str.equals("Z")) {
    			answer -= beforeNum;
    		} else {
    			answer += Integer.parseInt(str);
    			beforeNum = Integer.parseInt(str);
    		}
    	}
        return answer;
    }
}
