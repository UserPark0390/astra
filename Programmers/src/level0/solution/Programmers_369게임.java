package level0.solution;

public class Programmers_369게임 {

	public static void main(String[] args) {
		int order = 3;
		System.out.println(solution(order));
	}
    public static int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);
        for(int i = 0; i < str.length(); i++) {
        	if('3' == str.charAt(i) || '6' == str.charAt(i) || '9' == str.charAt(i)) {
        		answer++;
        	}        	
        }        
        return answer;
    }
	
}
