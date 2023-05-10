package level0.different;

public class Programmers_삼각형의완성조건2 {
	public static void main(String[] args) {
		int[] sides = {11, 7};
		System.out.println(solution(sides));
	}
    public static int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        answer += min * 2 - 1;
        return answer;
    }	
}
