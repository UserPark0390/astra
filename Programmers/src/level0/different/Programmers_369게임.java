package level0.different;

public class Programmers_369게임 {

	public static void main(String[] args) {
		int order = 3;
		System.out.println(solution(order));
	}
    public static int solution(int order) {
        int answer = 0;
        int count = 0;
        while(order != 0)
        {
            if(order % 10 == 3 || order % 10 == 6 || order % 10 == 9)
            {
                count++;
            }
             order = order/10;
        }
        answer = count;
        return answer;
    }
	
}
