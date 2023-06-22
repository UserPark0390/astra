package level0.different;

public class Programmers_다음에올숫자 {
	public static void main(String[] args) {
		int[] common = { 0, 10, 100, 1000 };
		System.out.println(solution(common));
	}

	public static int solution(int[] common) {
        int answer = 0;

        int x = common[1] - common[0];
        int y = common[2] - common[1];

        if (x == y) {
            answer = common[common.length - 1] + y;
        } else {
            answer = common[common.length - 1] * common[2] / common[1];
        }

        return answer;
	}

}
