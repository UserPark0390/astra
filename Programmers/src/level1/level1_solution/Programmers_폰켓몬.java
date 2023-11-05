package level1.level1_solution;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Programmers_폰켓몬 {
	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,4};
		System.out.println(solution(nums));
	}
	
    public static int solution(int[] nums) {
        int answer = 0;
        List<Integer> list = Arrays.stream(nums).boxed().distinct().collect(Collectors.toList());        
        answer = list.size() >= nums.length/2 ? nums.length/2 : list.size();        
        return answer;
    }
}
