package level0.solution;

public class Programmers_길이에따른연산 {
	
    public static int solution(int[] num_list) {  	
    	boolean check = num_list.length >= 11 ? true : false;     	
        int answer = 0;
        if(check) {
        	for(int i = 0; i < num_list.length; i++) {
        		answer += num_list[i];
        	}
        } else {
        	answer = 1;
        	for(int j = 0; j < num_list.length; j++) {
        		answer *= num_list[j];
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int [] num_list = {2, 3, 4, 5};
		System.out.println(solution(num_list));
	}
}
