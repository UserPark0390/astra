package level0.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programmers_등수매기기 {
	public static void main(String[] args) {
		//int[][] score = { { 80, 70 }, { 90, 50 }, { 40, 70 }, { 0, 80 } };
		//int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}, {0 , 0}};
		int[][] score = {{1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}, {7, 1}, {8, 1}, {9, 1}, {0 , 0}};
		System.out.println(Arrays.toString(solution(score)));
	}

	public static int[] solution(int[][] score) {
        List<Integer> scoreList = new ArrayList<>();
        for(int[] t : score){
            scoreList.add(t[0] + t[1]);
        }
        scoreList.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++){
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1])+1;
        }
        return answer;
	}

}
