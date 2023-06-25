package level1.level1_solution;

public class Programmers_카드뭉치 {
	public static void main(String[] args) {
		String[] cards1 = {"i", "drink", "water"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};		
		System.out.println(solution(cards1, cards2, goal));
	}
	
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        String [] check_card = new String[goal.length];
        int count_while = cards1.length -1;
        int check_num = 0;
        while(count_while > 0) {
            boolean check = false; // 카드 1회 넣는거
            boolean pass = false;
            int count = 0;
            int check_pass = 0;
            for(int i = 0; i < goal.length; i++) {
            	if(!check && check_num == 0) { // 처음일때
            		check = true;
            		check_num = 1;
            		check_card[i] = cards1[i];
            	} else if(check) {
            		check_card[i] = cards2[i-check_num];
            		count++;
            		if(count == cards2.length) {
            			check = false;
            		}          		
            	} else {
            		check_card[i] = cards1[check_num]; 
            		check_num++;
            	}
            }
            for(int i = 0; i < goal.length; i++) {
            	if(goal[i].equals(check_card[i])) {
            		check_pass++;        
            	}
            	if(check_pass == goal.length) {
            		pass = true;
            	}
            }
            if(pass) {
            	answer = "Yes";
            	break;
            } else {
            	answer = "No";
            }
        }
        return answer;
    }
}
