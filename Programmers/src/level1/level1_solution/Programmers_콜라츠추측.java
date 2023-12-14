package level1.level1_solution;

public class Programmers_콜라츠추측 {
	public static void main(String[] args) {
		int num = 626331;
		System.out.println(solution(num));
	}
	
    public static int solution(int num) {
        int answer = 0;
        int count = 500;
        long num_long = (long)num;
        while(count-- > 0) {
        	if(num_long == 1 && count == 499) {
        		return answer;
        	} else if(num_long == 1) {
        		break;
        	}
        	num_long = num_long % 2 == 0 ? num_long /= 2 : (num_long * 3) + 1;
        	answer++;
        	if(count == 0 && num_long != 1) {
        		answer = -1;
        	}
        }
        return answer;
    }
}
