package level1.level1_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Programmers_폰켓몬 {
	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,4};
		System.out.println(solution(nums));
	}
	
    public static int solution(int[] nums) {
    	return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
    }
}
