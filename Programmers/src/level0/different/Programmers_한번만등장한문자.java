package level0.different;

public class Programmers_한번만등장한문자 {
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(solution(s));
	}

	public static String solution(String s) {
        int[] alpha = new int[26];
        for(char c : s.toCharArray()){
            alpha[c - 'a']++;
        }

        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < 26; i++){
            if(alpha[i] == 1){
                answer.append((char)(i + 'a'));
            }
        }
        return answer.toString();
	}
}
