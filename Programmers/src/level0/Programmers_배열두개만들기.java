package level0;

public class Programmers_배열두개만들기 {
    public int[] solution(int[] numbers) {
        int[] answer = numbers.clone();
        for(int i = 0; i < numbers.length; i++) {
        	answer[i] = numbers[i]*2;
        }
        return answer;
    }
}
