package level0.solution;

import java.util.Scanner;

public class Programmers_피자나눠먹기2 {
	static int answer = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		solution(sc.nextInt());
		System.out.println(answer);
	}
    public static int solution(int n) {
        answer = 0;
        int max = 0;
        int min = 0;
        if(n % 6 == 0){
            answer = n / 6;
        } else {
            for(int i = 1; i <= n && i <= 6;i++){
                if(n % i == 0 && 6%i == 0){
                    max = i;
                }
            }
            min = (n * 6)/max;            
            answer = min / n;
        }                
        return answer;
    }
}
