package level0;

import java.util.Arrays;

public class Programmers_2차원으로만들기 {
	
	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = 2;
		System.out.println(Arrays.toString(solution(num_list, n)));
	}
	
    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = {};

        int length = num_list.length;

        answer = new int[length/n][n];

        for(int i=0; i<length; i++){
            answer[i/n][i%n]=num_list[i];
        }

        return answer;
    }
	
}
