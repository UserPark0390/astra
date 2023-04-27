package level0.solution;

public class Programmers_가까운수 {
	public static void main(String[] args) {
		int[] array = {10, 14, 11, 12};
		int n = 13;
		System.out.println(solution(array, n));
	}
	
    public static int solution(int[] array, int n) {
        int answer = 0;
        int tmp = 0;
        int checkNum = 0;
        for(int i = 0; i < array.length; i++) {
        	tmp = Math.abs(array[i]-n);
        	if(answer == 0) {
        		answer = array[i];
        		checkNum = tmp;
        	}
        	if(checkNum > tmp) {
        		answer = array[i];
        		checkNum = tmp;
        	} else if(checkNum == tmp) {
        		if(answer > array[i]) {
        			answer = array[i];
        		}
        	}
        }        
        return answer;
    }
	
}
