package level0.solution;

public class Programmers_삼각형의완성조건2 {
	public static void main(String[] args) {
		int[] sides = {11, 7};
		System.out.println(solution(sides));
	}
    public static int solution(int[] sides) {
        int answer = 0;
        int A = sides[0];
        int B = sides[1];      
        if(A > B) {
        	answer += (A-(A-B)) + ((A+B-1)-A);
        } else {
        	answer = (B-(B-A)) + (B+A-1)-B;
        }       
        return answer;
    }	
}
