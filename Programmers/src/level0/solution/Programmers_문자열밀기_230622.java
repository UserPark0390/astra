package level0.solution;

public class Programmers_문자열밀기_230622 {

	public static void main(String[] args) {
		String A = "atat";
		String B = "tata";
		System.out.println(solution(A, B));
	}

	public static int solution(String A, String B) {
		int answer = 0;
		String tmp = "";
		for (int i = 0; i < A.length(); i++) {
			if (A.equals(B) && i == 0) {
				answer = 0;
				break;
			} else if (A.equals(B)) {
				answer++;
				break;
			} else {
				tmp = A.charAt(A.length()-1)+"";
				for(int j = 0; j < A.length()-1; j++) {
					tmp += A.charAt(j)+"";				
				}
				A = tmp;
				tmp = "";
				if (A.equals(B)) {
					answer++;
					break;
				}				
				answer++;
			}
			if(A.length()-1 == i && !A.equals(B)) {
				answer = -1;
			}
		}
		return answer;
	}

}
