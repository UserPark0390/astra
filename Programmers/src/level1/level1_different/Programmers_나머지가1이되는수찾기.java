package level1.level1_different;

public class Programmers_나머지가1이되는수찾기 {
	public static void main(String[] args) {
		int n = 12;
		System.out.println(solution(n));
	}
	
    public static int solution(int n) {
    	  int answer = 1;

          while(true) {
              if (n%answer==1) break;
              answer++;
          }

          return answer;
    }
}
