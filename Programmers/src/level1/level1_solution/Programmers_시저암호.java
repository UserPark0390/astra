package level1.level1_solution;

public class Programmers_시저암호 {
	public static void main(String[] args) {
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int n = 25;
		System.out.println(solution(s, n));
	}

	// 아스키코드로 푸는게 제일 좋을듯

	public static String solution(String s, int n) {
		String answer = "";
		String[] s_arr = s.split("");
		for (int i = 0; i < s_arr.length; i++) {
			char change = (char) ((int) s_arr[i].charAt(0));
			if ((change >= 65 && change <= 90) || (change >= 97 && change <= 122)) {
				
				answer += String.valueOf(change + "");
			} else if (change > 90 || change > 122) {
				answer += String.valueOf((char) (change - 26) + "");
			} else {
				answer += " ";
			}

		}
		return answer;
	}
}
