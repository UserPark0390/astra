package level0.solution;

import java.util.ArrayList;
import java.util.List;

public class Programmers_순서쌍의개수 {

	public static void main(String[] args) {
		int n = 100;
		System.out.println(solution(n));
	}
	
    public static int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
        	if(n%i == 0) {
        		list.add(i);
        	}
        }
        answer = list.size();    
        return answer;
    }
	
}
