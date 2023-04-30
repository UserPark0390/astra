package level0.different;

public class Programmers_문자열계산하기 {
	public static void main(String[] args) {
		String my_string = "13 - 500 - 200";
		System.out.println(solution(my_string));
	}

	public static int solution(String my_string) {
        int answer = 0;
        String[] s = my_string.trim().split(" ");
        int oper = 1;
        for (String s1 : s) {
            if(s1.equals("+") || s1.equals("-")){
                oper = s1.equals("-") ? -1 : 1;
            }else{
                answer += Integer.parseInt(s1) * oper;
            }
        }
        return answer;
	}
}
