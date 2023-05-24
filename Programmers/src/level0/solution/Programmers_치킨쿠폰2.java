package level0.solution;

public class Programmers_치킨쿠폰2 {
	public static void main(String[] args) {
		int chicken = 1081;
		System.out.println(solution(chicken));
	}

	public static int solution(int chicken) {
		int answer = 0;
		int tmp = 0;
		while (chicken >= 1) {
			if (chicken / 10 >= 1 && chicken % 10 == 0) {
				answer += chicken / 10;
				chicken /= 10;
				if (chicken < 10 && tmp > 0) {
					chicken += tmp;
					tmp = 0;
				} else if(chicken >= 10) {
					continue;
				} else {
					break;
				}
			} else if (chicken / 10 >= 1 && chicken % 10 > 0) {
				answer += chicken / 10;
				tmp += chicken % 10;
				chicken = chicken / 10;
				if (tmp >= 10) {
					chicken += tmp / 10;
					tmp = tmp % 10;
				} else if(chicken >= 10){
					continue;
				} else {
					break;
				}
			}
		}
		return answer;
	}
}
