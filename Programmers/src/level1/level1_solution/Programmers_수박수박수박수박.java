package level1.level1_solution;

public class Programmers_수박수박수박수박 {
	public static void main(String[] args) {
		int n = 4;
		System.out.println(solution(n));
	}

	public static String solution(int n) {
		String answer = "";
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				answer += "수";
			} else {
				answer += "박";
			}
			// answer += (i%2 == 0 ? "수" : "박");
		}		
		return answer;
	}

}
