package level0.solution;

import java.util.Arrays;

public class Programmers_특이한정렬 {
	public static void main(String[] args) {
		int[] numlist = {1, 2, 3, 4, 5, 6};
		int n = 4;
		System.out.println(solution(numlist, n));
	}
	
    public static int[] solution(int[] numlist, int n) {
    	 int[] answer = new int[numlist.length];
         double[] change = new double[numlist.length];
         
         for(int i = 0; i < numlist.length; i++) {
             if(numlist[i] - n < 0) 
                 // n을 뺏을 때 음수 값인 경우, +0.5를 해서 같은 거리에 있는 양수 값보다 정렬을 했을 시 뒤로 밀리도록 함 
            	 change[i] = ((int)Math.abs(numlist[i] - n)) + 0.1;
             else 
            	 change[i] = numlist[i] - n; 
         }
         
         Arrays.sort(change); // 오름차순 정렬
         
         for(int i = 0; i < numlist.length; i++) {
             if(change[i] % 1 != 0) answer[i] = n - (int)change[i];
             else answer[i] = (int)change[i] + n;
         }
         
         return answer;
    }
}
