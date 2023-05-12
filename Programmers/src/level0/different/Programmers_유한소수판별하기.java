package level0.different;

public class Programmers_유한소수판별하기 {
	public static void main(String[] args) {
		int a = 11;
		int b = 22;
		System.out.println(solution(a, b));
	}

	public static int solution(int a, int b) {
        int answer = 0;

        for (;b%2 == 0;) {
            b = b/2;
        }
        for (;b%5 == 0;) {
            b = b/5;
        }

        if ((a/(double)b)%1 == 0) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }

}
