package level0;
// 기약분수로 값을 출력하기
public class Programmers_분수의덧셈 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int First = (numer1 * denom2) + (numer2 * denom1); 
        int Second = denom1 * denom2;
        for(int i = First-1; i > 1; i--) {
            if(First % i == 0 && Second % i == 0) { 
            	First /= i;
            	Second /= i;
            }
        }      
        int[] answer = { First, Second };
        return answer;
    }
}
