package level1.level1_different;

public class Programmers_핸드폰번호가리기 {
	public static void main(String[] args) {
		String phone_number = "027778888";
		System.out.println(solution(phone_number));
	}
	
    public static String solution(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }
}
