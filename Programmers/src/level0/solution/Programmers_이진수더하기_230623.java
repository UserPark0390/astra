package level0.solution;

public class Programmers_이진수더하기_230623 {
	static int sum;
	static String answer;

	public static void main(String[] args) {
		String bin1 = "1001";
		String bin2 = "1111";
		System.out.println(solution(bin1, bin2));
	}
	
    public static String solution(String bin1, String bin2) {
        String answer = "";
        int A = Integer.parseInt(bin1, 2);
        int B = Integer.parseInt(bin2, 2);
        int Sum = A+B;
        answer = Integer.toBinaryString(Sum);
        return answer;
    }

}
