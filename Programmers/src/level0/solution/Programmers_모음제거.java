package level0.solution;


public class Programmers_모음제거 {
	public static void main(String[] args) {
		String my_string = "nice to meet you";
		System.out.println(solution(my_string));
	}

    public static String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
        	char ch = my_string.charAt(i);
        	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        		ch = 'a';
        	}
        	answer += ch;
        }        
        return answer.replace("a", "");
        
        // 2번째 방법
//        answer = my_string.replaceAll("[aeiou]", "");
//        
//        return answer;
        
    }

}
