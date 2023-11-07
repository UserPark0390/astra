package level1.level1_different;

public class Programmers_카드뭉치_231105_sol2 {
	public static void main(String[] args) {
		String[] cards1 = { "list", "length", "important" };
		String[] cards2 = { "are", "very" };
		String[] goal = { "are", "very" };
		System.out.println(solution(cards1, cards2, goal));
	}

	public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        if (dfs(cards1, cards2, goal, 0, 0, 0)) {
            answer = "Yes";
        } else {
            answer = "No";
        }
        return answer;
    }


    public static boolean dfs(String[] cards1, String[] cards2, String[] goal, int left, int right, int target) {
        if (target == goal.length) {
            return true;
        }

        if (left < cards1.length && goal[target].equals(cards1[left])) {
            return dfs(cards1, cards2, goal, left + 1, right, target + 1);
        }
        if (right < cards2.length && goal[target].equals(cards2[right])) {
            return dfs(cards1, cards2, goal, left, right + 1, target + 1);
        }
        return false;
    }
}
