package level0.different;

public class Programmers_머쓱이보다키큰사람 {
	public static void main(String[] args) {
		int[] array =  {149, 180, 192, 170};
		int height = 167;
		System.out.println(solution(array, height));
	}
    public static int solution(int[] array, int height) {
        int answer = 0;
        for(int i: array){
            answer += (i>height) ? 1 : 0;
        }
        return answer;
    }

}
