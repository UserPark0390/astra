package level0;

import java.util.Scanner;

public class Programmers_옷가게할인받기 {
	static int price = 0;
	static int answer = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		solution(sc.nextInt());
		System.out.println(answer);
	}
	
    public static int solution(int price) {
        if(price < 100000){
            answer = price;
        } else {
            if(price >= 100000 && price < 300000){
                answer = (int)(price - price * 0.05);
            } else if(price >= 300000 && price < 500000){
                answer = (int)(price - price * 0.1);
            } else {
                answer = (int)(price - price * 0.2);
            }
        }
        return answer;
    }
}
