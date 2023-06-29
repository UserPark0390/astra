package level1.level1_different;

public class Programmers_숫자문자열과영단어 {

	public static void main(String[] args) {
		String s = "23four5six7";
		System.out.println(solution(s));
	}
	
    public static int solution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
	
}

