package level1.level1_different;

public class Programmers_소수만들기 {
	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		System.out.println(solution(nums));
	}

	public static int solution(int[] nums) {
	       int ans = 0;

	        for(int i = 0; i < nums.length - 2; i ++){
	            for(int j = i + 1; j < nums.length - 1; j ++){
	                for(int k = j + 1; k < nums.length; k ++ ){
	                    if(isPrime(nums[i] + nums[j] + nums[k])){
	                        ans += 1;  
	                    } 
	                }
	            }
	        }
	        return ans;
	    }
	    public static Boolean isPrime(int num){
	        int cnt = 0;
	        for(int i = 1; i <= (int)Math.sqrt(num); i ++){
	            if(num % i == 0) cnt += 1; 
	        }
	        return cnt == 1;
	    }
}
