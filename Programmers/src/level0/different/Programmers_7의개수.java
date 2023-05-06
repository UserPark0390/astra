package level0.different;

public class Programmers_7의개수 {
	public static void main(String[] args) {
		int[] array = {10, 29};
		System.out.println(solution(array));
	}

	public static int solution(int[] array) {
		   int answer = 0;
	        for(int a : array){
	            while(a != 0){
	                if(a % 10 == 7){
	                    answer++;
	                }
	                a /= 10;
	            }
	        }
	        return answer;
	}

}
