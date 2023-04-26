package level0.solution;

public class Programmers_삼각형의완성 {
	public static void main(String[] args) {
		int[] sides = {199, 72, 222};
		System.out.println(solution(sides));
	}
	
    public static int solution(int[] sides) {
        int answer = 0;
        int A = sides[0];
        int B = sides[1];
        int C = sides[2];
        	
        if(A >= B && A >= C) {
        	if(A >= B+C) {
        		answer = 2;
        	} else {
        		answer = 1;
        	}
        } else if(B >= A && B >= C) {
        	if(B >= A+C) {
        		answer = 2;
        	} else {
        		answer = 1;
        	}
        } else {
        	if(C >= A+B) {
        		answer = 2;
        	} else {
        		answer = 1;
        	}
        }
        
        return answer;
    }
}
