package level0;

public class Programmers_개미군단 {
	public static void main(String[] args) {
		int hp = 999;
		System.out.println(solution(hp));
	}
	
    public static int solution(int hp) {
        int answer = 0;
        int tmp = 0;
        
        answer = hp / 5;
        tmp = hp % 5;
        answer += tmp / 3;
        answer += tmp % 3;
        
        return answer;
        
        //return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
    }
}
