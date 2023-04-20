package level0;

import java.math.BigInteger;

public class Programmers_구슬을나누는경우의수2 {

	static int answer = 0;

	public static void main(String[] args) {
		int balls = 5;
		int share = 3;
		System.out.println(solution(balls, share));
	}

	public static int solution(int balls, int share) {

		BigInteger bN[] = new BigInteger[balls + 1];

		bN[0] = new BigInteger("1");
		for (int i = 1; i <= balls; i++) {

			bN[i] = new BigInteger(Integer.toString(i));
			bN[i] = bN[i].multiply(bN[i - 1]);
		}

		answer = bN[balls].divide(bN[share].multiply(bN[balls - share])).intValue();

		return answer;
	}
}
