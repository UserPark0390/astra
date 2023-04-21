package level0;

import java.util.Arrays;

public class Programmers_2차원으로만들기2 {
	
	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = 2;
		System.out.println(Arrays.toString(solution(num_list, n)));
	}
	
    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int [num_list.length/n][n];
        
        for(int i = 0; i < num_list.length / n; i++) {
        	int [] A = new int [n];
        	for(int j = 0; j < n; j++) {
        		A[j] = num_list[i*n+j];
        	}
        	answer[i] = A;
        }
        
        return answer;
    }
	
}
