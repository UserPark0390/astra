package level1.level1_solution;

public class Programmers_크기가작은부분문자열 {
	public static void main(String[] args) {
		String t = "3141592";
		String p = "271";
		System.out.println(solution(t, p));
	}
	
    public static int solution(String t, String p) {
        int answer = 0;
        for(int i = 0; i < t.length()-p.length()+1; i++) {
        	Long checkNum_t = Long.parseLong(t.substring(i, i + p.length()));
        	Long checkNum_p = Long.parseLong(p);
        	if(checkNum_t <= checkNum_p) {
        		answer++;
        	}
        }        
        return answer;
    }
}
