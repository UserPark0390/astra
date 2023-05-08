package level0.solution;

public class Programmers_직사각형넓이구하기_삽질 {
	public static void main(String[] args) {
		int[][] dots = {{1, 1}, {-5, 1}, {-5, 2}, {1, 2}}; 
		System.out.println(solution(dots));
	}
    public static int solution(int[][] dots) {
        int answer = 0;
        int aX = 0;
        int aY = 0;
        int sumX = 0;
        int bX = 0;
        int bY = 0;
        int sumY = 0;
       
        if(dots[0][0] >= 0 && dots[1][0] >= 0) { // 둘 다 + 일 때
        	aX = dots[0][0];
        	bX = dots[1][0];
        	sumX = bX-aX;
        } else if(dots[0][0] < 0 && dots[1][0] < 0) { // 둘 다 -일 때
        	aX = Math.abs(dots[0][0]);
        	bX = Math.abs(dots[1][0]);
        	sumX = bX-aX;    
        } else if(dots[0][0] < 0 && dots[1][0] >= 0 || dots[0][0] >= 0 && dots[1][0] < 0) { // 하나는 + 다른 하나는 -
        	if(dots[0][0] < 0 && dots[1][0] >= 0) {
        		aX = Math.abs(dots[0][0]);
            	bX = dots[1][0];
            	sumX = aX + bX;
        	} else {
        		aX = dots[0][0];
            	bX = Math.abs(dots[1][0]);
            	sumX = aX + bX;
        	}

        }
        
        if(dots[1][1] >= 0 && dots[2][1] >= 0) { // 둘 다 + 일 때
        	aY = dots[1][1];
        	bY = dots[2][1];
        	sumY = bY-aY;
        } else if(dots[1][1] < 0 && dots[2][1] < 0) { // 둘 다 -일 때
        	aY = Math.abs(dots[1][1]);
        	bY = Math.abs(dots[2][1]);
        	sumY = bY-aY;   
        } else if(dots[1][1] >= 0 && dots[2][1] < 0 || dots[1][1] < 0 && dots[2][1] >= 0) { // 하나는 + 다른 하나는 -
        	if(dots[2][1] < 0 && dots[1][1] >= 0) {
            	aY = dots[1][1];
            	bY = Math.abs(dots[2][1]);
            	sumY = aY + bY;
        	} else {
            	aY = Math.abs(dots[1][1]);
            	bY = dots[2][1];
            	sumY = aY + bY;
        	}
        }
        answer = sumX * sumY;
        	
        
        
        return answer;
    }
	
}
