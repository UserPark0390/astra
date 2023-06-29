package level1.level1_different;

public class Programmers_숫자문자열과영단어2 {

	public static void main(String[] args) {
		String s = "23four5six7";
		System.out.println(solution(s));
	}
	
    public static int solution(String s) {
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(alphabets[i],digits[i]);
        }

        return Integer.parseInt(s);
    }
	
}

