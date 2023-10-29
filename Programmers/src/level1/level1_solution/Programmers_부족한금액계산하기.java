package level1.level1_solution;

public class Programmers_부족한금액계산하기 {
	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		System.out.println(solution(price, money, count));
	}
    public static long solution(int price, int money, int count) {
        long answer = 0;
        long check = 0; // price 누적 값
        for(int i = 1; i <= count; i++) {
        	check += price * i;
        }
        answer = money - check < 0 ? check - money : 0;      
        return answer;
    }	
}
