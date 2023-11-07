package level1.level1_different;

public class Programmers_카드뭉치_231105_sol3 {
	public static void main(String[] args) {
		String[] cards1 = { "list", "length", "important" };
		String[] cards2 = { "are", "very" };
		String[] goal = { "are", "very" };
		System.out.println(solution(cards1, cards2, goal));
	}

	public static String solution(String[] cards1, String[] cards2, String[] goal) {
	       int answer = 0;
	        String card1 = String.join(" ", cards1);
	        String card2 = String.join(" ", cards2);

	        for (int i = 0; i < goal.length; i++) {
	            if (goal[i].equals(card1.split(" ")[0])) {
	                card1 = card1.replaceFirst(goal[i], "").trim();
	                continue;

	            } else if (goal[i].equals(card2.split(" ")[0])) {
	                card2 = card2.replaceFirst(goal[i], "").trim();
	                continue;

	            } else {
	                answer = 1;
	                break;
	            }
	        }

	        return answer == 0 ? "Yes" : "No";
	    }
}
