package level0;

public class Programmers_양꼬치 {
    public int solution(int n, int k) {
    	// n = 양꼬치 / k = 음료수   /  양꼬치 10개에 음료수 하나 무료
    	int tmp = 0;
    	int answer = 0;
    	if(n >= 10) {
    		tmp = n/10;
    	}    	
    	answer = n*12000 + (k-tmp)*2000;
        return answer;
    }
}
