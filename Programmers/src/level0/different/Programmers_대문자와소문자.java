package level0.different;

public class Programmers_대문자와소문자 {
	public static void main(String[] args) {
		String my_string = "cccCCC";
		System.out.println(solution(my_string));
	}
	
    public static String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(Character.isUpperCase(c)){
                answer += String.valueOf(c).toLowerCase();
            }else{
                answer += String.valueOf(c).toUpperCase();
            }
        }
        return answer;
    }
}
