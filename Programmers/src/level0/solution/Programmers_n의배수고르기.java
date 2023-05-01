package level0.solution;

import java.util.*;

public class Programmers_n의배수고르기 {
	public static void main(String[] args) {
		int n = 3;
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12}; 
		System.out.println(Arrays.toString(solution(n, numlist)));		
	}
	
    public static int[] solution(int n, int[] numlist) {
        List<Integer>list = new ArrayList<>();
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                list.add(numlist[i]);
            }
        }
        int[] answer = new int [list.size()];
        for(int j = 0; j < list.size(); j++){
            answer[j] = list.get(j);
        }
        return answer;
    }
}
