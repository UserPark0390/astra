package level1.level1_solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_카드뭉치_231105 {
	public static void main(String[] args) {
		String[] cards1 = { "i", "drink", "water" };
		String[] cards2 = { "want", "to" };
		String[] goal = { "i", "want", "to", "drink", "water" };
		System.out.println(solution(cards1, cards2, goal));
	}

	public static String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "";
		String[] check_card = new String[goal.length];
		
		boolean check = false; // false = cards1 / true = card2
		boolean check_change = false; // 1회 되면 false -> true , true에서 없다고 본다면 NO를 출력할 수 있게

		List<String> cards1_list = new ArrayList<>(Arrays.asList(cards1)); 
		List<String> cards2_list = new ArrayList<>(Arrays.asList(cards2));
		
		for(int i = 0; i < goal.length; i++) {
			System.out.println("goal : " +  goal[i]);
			if(!check) {
				if(cards1_list.size() > 0) {
					if(goal[i].equals(cards1_list.get(0))) {
						cards1_list.remove(0);
						check_change = false;
					} else if(check_change){
						answer = "No";
						break;
					} else {
						check = true;
						check_change = true;
						i--;
					}
				} else {
					check = true;
				}
			} else {
				if(cards2_list.size() > 0) {
					if(goal[i].equals(cards2_list.get(0))) {
						cards2_list.remove(0);
						check_change = false;
					} else if(check_change){
						answer = "No";
						break;
					} else {
						check = false;
						check_change = true;
						i--;
					}
				} else {
					check = false;
				}
			}
			if(cards1_list.size() == 0 && cards2_list.size() == 0) {
				answer = "Yes";
			}		
		}
				
		return answer;
	}
}
