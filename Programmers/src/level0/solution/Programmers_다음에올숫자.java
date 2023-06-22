package level0.solution;

public class Programmers_다음에올숫자 {
	public static void main(String[] args) {
		int[] common = { 0, 10, 100, 1000 };
		System.out.println(solution(common));
	}

	public static int solution(int[] common) {
		int answer = 0;
		int checkSum = common[1] - common[0];
		int checkMul = 0;
		boolean checkZero = false;
		int Number = 0;
		for(int i = 0; i < common.length; i++) {
			if(common[i] == 0) {
				checkZero = true;
				Number = i;
			}
		}
		if(checkZero) {
			checkMul = 0;
		} else {
			checkMul = common[1] / common[0];
		}

		if (common[2] == common[1] + checkSum) {
			answer = common[common.length - 1] + checkSum;
		} else {
			answer = common[common.length - 1] * checkMul;
		}

		return answer;
	}

}
