package level1.level1_different;

public class Programmers_핸드폰번호가리기2 {
	public static void main(String[] args) {
		String phone_number = "027778888";
		System.out.println(solution(phone_number));
	}
	
    public static String solution(String phone_number) {
    	return phone_number.replaceAll(".(?=.{4})", "*");
    }
}
