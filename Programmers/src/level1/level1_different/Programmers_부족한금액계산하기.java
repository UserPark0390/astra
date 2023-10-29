package level1.level1_different;

public class Programmers_부족한금액계산하기 {
	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		System.out.println(solution(price, money, count));
	}
    public static long solution(int price, int money, int count) {
        long answer = -1;
        answer = (long)price*count*(count+1)/2 - money;
        return answer<=0?0:answer;
    }	
}
