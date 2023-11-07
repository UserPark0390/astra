package level1.level1_solution;

public class Programmers_3진법뒤집기 {
	public static void main(String[] args) {
		int n = 100000000;
		System.out.println(solution(n));
	}
	
    public static int solution(int n) {
    	StringBuilder sb = new StringBuilder();
    	String change_3 = sb.append(Integer.toString(n ,3)).reverse().toString();   	
        int answer = Integer.parseInt(change_3, 3);      
        return answer;
    }
}
