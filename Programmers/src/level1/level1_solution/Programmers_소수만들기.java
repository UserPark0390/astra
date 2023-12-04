package level1.level1_solution;

public class Programmers_소수만들기 {
	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		System.out.println(solution(nums));
	}

	public static int solution(int[] nums) {
		check_numArr();
		int answer = 0;
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i+1; j < nums.length -1; j++) {
				for (int k = j+1; k < nums.length; k++) {
					int check = nums[i]+nums[j]+nums[k];
					answer += !check_num[check] ? 1 : 0; 
				}
			}
		}

		return answer;
	}
	
	private static boolean[] check_num = new boolean[3001];
	
    private static void check_numArr() {
        for(int i = 2; i * i <= 3000; i++)
            for(int j = i; i * j <= 3000; j++)
            	check_num[i * j] = true;
    }
}
