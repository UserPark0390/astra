package level0.solution;

public class Programmers_직사각형넓이구하기 {
	public static void main(String[] args) {
		int[][] dots = { { 0, 1 }, { 1, 1 }, { 1, 0 }, { 0, 0 } };
		System.out.println(solution(dots));
	}

	public static int solution(int[][] dots) {
        int wide = 0;
        int height = 0;
        int x = dots[0][0];
        int y = dots[0][1];
        for (int i = 1; i < dots.length; i++) {
            if (x != dots[i][0]) {
            	wide = Math.abs(x - dots[i][0]);
            }            
            if (y != dots[i][1]) {
            	height = Math.abs(y - dots[i][1]);
            }
        }
        return wide * height;
	}

}
