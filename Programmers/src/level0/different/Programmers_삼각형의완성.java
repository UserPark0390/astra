package level0.different;

import java.util.Arrays;

public class Programmers_삼각형의완성 {
	public static void main(String[] args) {
		int[] sides = {199, 72, 222};
		System.out.println(solution(sides));
	}
	
    public static int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        return sides[2] >= sides[0]+sides[1] ? 2 : 1;
    }
}
