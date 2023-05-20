package level0.solution;

public class Programmers_문자열밀기 {
	public static void main(String[] args) {
		String A = "hello";
		String B = "ohell";
		System.out.println(solution(A, B));
	}

	public static int solution(String A, String B) {
		int answer = 0;
		int count = 0;
		String tmp = "";
		String equel = A;
		String Real = "";
		while (count < A.length()-1) {
			Real = equel;
			if (equel.equals(B) && count == 0) { // equel 하고 B를 비교 
				answer = 0;
				break;
			} else { // 그것이 아니면
				tmp = Character.toString(Real.charAt(0));  // 
				equel = "";
			}			
			for (int i = 1; i < A.length(); i++) {
				equel += Real.charAt(i);
			}
			equel += tmp;
			tmp = "";
			Real = "";
			if (equel.equals(B)) {
				if(answer == 0) {
					answer = count; 
				} else if(answer < count){
					continue;
				} else {
					answer = count;
				}
			}
			if(count == A.length()-1 && answer == 0) {
				answer = -1;
			}
		}
		return answer;
	}
}
