package level1.level1_solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Programmers_과일장수 {
	public static void main(String[] args) {
		int k = 4;
		int m = 3;
		int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2 };
		System.out.println(solution(k, m, score));
	}

	public static int solution(int k, int m, int[] score) {
		int answer = 0;
		Arrays.sort(score);
		List<Integer> score_list = Arrays.stream(score).boxed().collect(Collectors.toList());
		Collections.reverse(score_list);		
		List<Integer> box = new ArrayList<>();

		boolean check = false;
		if(score_list.size() % m == 0) {
			check = true;
		}
		
		while (true) {
			if(box.size() < m){
				box.add(score_list.get(0));
				score_list.remove(0);
			}
			if(box.size() == m) {				
				Collections.sort(box);
				answer += box.get(0) * box.size();
				box.clear();		
			} 
			if(check) {
				if(score_list.size() == 0){
					break;	
				} else {
					continue;
				}
			} else  {
				if(score_list.size() < m) {
					break;	
				} else {
					continue;
				}
			}
		
		}
		return answer;
	}
}
