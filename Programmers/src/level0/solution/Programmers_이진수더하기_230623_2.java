package level0.solution;

public class Programmers_이진수더하기_230623_2 {
	static int sum;
	static String answer;

	public static void main(String[] args) {
		String bin1 = "1001";
		String bin2 = "1111";
		System.out.println(solution(bin1, bin2));
	}
	
    public static String solution(String bin1, String bin2) {
    	return Integer.toBinaryString(Integer.parseInt(bin1, 2)+Integer.parseInt(bin2, 2));
    }

}
