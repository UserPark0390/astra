package level0.different;

import java.util.List;
import java.util.HashSet;

public class Programmers_배열의유사도 {
	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		System.out.println(solution(s1, s2));
	}
    public static int solution(String[] s1, String[] s2) {
        int answer = 0;
        HashSet<String> set = new HashSet<>(List.of(s1));
        for (String s : s2) {
            if(set.contains(s)){
                answer++;
            }
        }
        return answer;
    }
}
