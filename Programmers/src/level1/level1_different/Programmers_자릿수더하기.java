package level1.level1_different;

public class Programmers_자릿수더하기 {
	public static void main(String[] args) {
		int n = 987;
		System.out.println(solution(n));
	}
	
    public static int solution(int n) {
        int answer = 0;

        while(n>10){
            answer+=n%10;
            if(n<10)
                break;

            n=n/10;
        }
        return answer;
    }
}
