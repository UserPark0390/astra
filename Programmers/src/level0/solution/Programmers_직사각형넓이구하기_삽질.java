package level0.solution;

public class Programmers_직사각형넓이구하기_삽질 {
	public static void main(String[] args) {
		int[][] dots = { { 0, 1 }, { 1, 1 }, { 1, 0 }, { 0, 1 } };
		System.out.println(solution(dots));
	}

	public static int solution(int[][] dots) {
		int answer = 0;
		int aX = 0;
		int aY = 0;
		int sumX = 0;
		boolean checkX = false; // false = -1 이하
		int bX = 0;
		int bY = 0;
		int sumY = 0;
		boolean checkY = false;

		for (int i = 0; i < dots.length; i++) {
			if (i == 0) {
				aX = dots[i][0];
				aY = dots[i][1];
			}
			if (dots[i][0] >= 0 && aX < dots[i][0]) {
				bX = dots[i][0];
				checkX = true;
			} else if(aX != dots[i][0] && dots[i][0] < 0){
				bX = dots[i][0];
			}

			if (dots[i][1] >= 0 && aY < dots[i][1]) {
				bY = dots[i][1];
				checkY = true;
			} else if(aY != dots[i][1] && dots[i][1] < 0){
				bY = dots[i][1];
			}
		}
		if (aX >= 0 && checkX) { // 둘 다 + / bx > ax
			sumX = bX - aX;
		} else if ((aX < 0 && checkX) || (aX > 0 && !checkX)) {
			if (aX < 0 && checkX) { // ax = -  / bx = +
				sumX = Math.abs(aX) + bX;
			} else { // ax = + / bx = -
				sumX = aX + Math.abs(bX);
			}
		} else {
			if(Math.abs(bX) > Math.abs(aX)) {
				sumX = Math.abs(bX) - Math.abs(aX);
			} else {
				sumX = Math.abs(aX) - Math.abs(bX);
			}
		}

		if (bY >= 0 && checkY) {
			sumY = bY - aY;
		} else if ((aY < 0 && checkY) || (aY > 0 && !checkY)) {
			if (aY < 0 && checkY) {
				sumY = Math.abs(aY) + bY;
			} else {
				sumY = aY + Math.abs(bY);
			}
		} else {
			if(Math.abs(bY) > Math.abs(aY)) {
				sumY = Math.abs(bY) - Math.abs(aY);
			} else {
				sumY = Math.abs(aY) - Math.abs(bY);
			}
		}
		answer = sumX * sumY;
		return answer;
	}

}
