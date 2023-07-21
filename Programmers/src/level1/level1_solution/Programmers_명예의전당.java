package level1.level1_solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programmers_명예의전당 {
	public static void main(String[] args) {
//		int k =  3;
//		int[] score = {10, 100, 20, 150, 1, 100, 200};
		int k =  4;
		int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
		System.out.println(Arrays.toString(solution(k, score)));
	}
	
    public static int[] solution(int k, int[] score) {
        int[] answer = new int [score.length];
        List<Integer> list_k = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
        	if(list_k.size() == k) {
        		if(score[i] >= list_k.get(0)) {
        			list_k.set(0, score[i]);
        		}
        	} else {
        		list_k.add(score[i]);
        	}
        	Collections.sort(list_k);
        	answer[i] = list_k.get(0);        	
        }        
        return answer;
    }
}
