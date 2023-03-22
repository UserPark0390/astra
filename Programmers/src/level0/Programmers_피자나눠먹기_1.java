package level0;

public class Programmers_피자나눠먹기_1 {
    public int solution(int n) {
        int answer = 0;
        
        if(n%7 == 0) {
        	answer = n/7;
        } else {
        	answer = n/7 + 1;
        }
        return answer;
    }
}
