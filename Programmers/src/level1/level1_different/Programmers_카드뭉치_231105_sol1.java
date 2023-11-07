package level1.level1_different;

public class Programmers_카드뭉치_231105_sol1 {
	public static void main(String[] args) {
		String[] cards1 = { "list", "length", "important" };
		String[] cards2 = { "are", "very" };
		String[] goal = { "are", "very" };
		System.out.println(solution(cards1, cards2, goal));
	}

	public static String solution(String[] cards1, String[] cards2, String[] goal) {
	       String answer = "Yes";
	        int idx1 = 0;
	        int idx2 = 0;

	        for(String str : goal) {
	            if(isAnswer(cards1, str, idx1)) {
	                idx1++;
	            } else if(isAnswer(cards2, str, idx2)) {
	                idx2++;
	            } else {
	                answer = "No";
	                break;
	            }
	        }

	        return answer;
	    }

	    private static boolean isAnswer(String[] cards, String str, int idx) {
	        boolean flag = false;

	        if(idx < cards.length) {
	            flag = str.equals(cards[idx]);
	        }
	        return flag;
	    }
}
