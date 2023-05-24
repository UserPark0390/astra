package level0.solution;

public class Programmers_치킨쿠폰 {
	public static void main(String[] args) {
		int chicken = 100;
		System.out.println(solution(chicken));
	}

	public static int solution(int chicken) {
		int answer = 0;
		int coupon = chicken; // 쿠폰
		while (coupon > 9) {
			if (coupon / 10 >= 1) {
				int change = coupon / 10;
				answer += change;
				coupon -= change * 10;
				coupon += change;				
			}		
		}
		return answer;
	}
}
