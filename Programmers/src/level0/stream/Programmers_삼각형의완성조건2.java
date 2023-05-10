package level0.stream;

public class Programmers_삼각형의완성조건2 {
	public static void main(String[] args) {
		int[] sides = {11, 7};
		System.out.println(solution(sides));
	}
    public static int solution(int[] sides) {
    	 return Math.max(sides[0], sides[1]) - (Math.max(sides[0], sides[1]) - Math.min(sides[0], sides[1])) + (sides[0] + sides[1]) - Math.max(sides[0], sides[1]) - 1;
    }	
}
