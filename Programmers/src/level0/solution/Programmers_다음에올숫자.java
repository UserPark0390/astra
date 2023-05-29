package level0.solution;

public class Programmers_다음에올숫자 {
	public static void main(String[] args) {
		int[] common = {2, 4, 8};
		System.out.println(solution(common));
	}
	
    public static int solution(int[] common) {
        int answer = 0;
        int tmp = 0;
        for(int i = 0; i < common.length-1; i++) {
        	if(i == 0) {
        		tmp = common[i];
        	} else if(common[i] + tmp == common[i+1]) {
        		answer = tmp + common[i+1];
        	} else if(common[i] * (common[i] - tmp) == common[i+1]) {
        		answer = tmp * common[i+1];
        	}
        }       
        return answer;
    }
	
}
