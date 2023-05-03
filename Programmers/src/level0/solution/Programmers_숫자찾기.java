package level0.solution;

public class Programmers_숫자찾기 {
	public static void main(String[] args) {
		int num = 123456;
		int k = 7;
		System.out.println(solution(num, k));
	}

	public static int solution(int num, int k) {
		int answer = 0;
		String str = String.valueOf(num);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) - '0' == k) {
				if(answer > 0) {
					break;
				} else {
					answer = i + 1;	
				}				
			}
			if(str.length() -1 == i && answer == 0) {
				answer = -1;
			}
		}
		return answer;
	}
}
