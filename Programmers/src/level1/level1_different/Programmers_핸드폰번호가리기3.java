package level1.level1_different;

public class Programmers_핸드폰번호가리기3 {
	public static void main(String[] args) {
		String phone_number = "027778888";
		System.out.println(solution(phone_number));
	}
	
    public static String solution(String phone_number) {
        String answer = "";

        for (int i = 0; i < phone_number.length() - 4; i++)
            answer += "*";

        answer += phone_number.substring(phone_number.length() - 4);

        return answer;
    }
}
