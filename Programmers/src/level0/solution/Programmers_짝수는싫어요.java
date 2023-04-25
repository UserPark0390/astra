package level0.solution;

public class Programmers_짝수는싫어요 {
    public static int[] solution(int n) {
    	int Array = 0;
    	if(n%2 == 0) {
    		Array = n/2;
    	} else {
    		Array = n/2+1;
    	}
        int[] answer = new int [Array];
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = 1 + 2 * i;
        }
        
        return answer;
        //return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
    public static void main(String[] args) {
    	int n = 10;
    	System.out.println(solution(n));
	}
}
