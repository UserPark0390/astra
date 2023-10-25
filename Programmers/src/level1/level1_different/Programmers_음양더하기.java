package level1.level1_different;

public class Programmers_음양더하기 {

	public static void main(String[] args) {
		int [] absolutes = {1,2,3};
		boolean [] signs = {false,false,true};
		System.out.println(solution(absolutes, signs));
	}
	
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<signs.length; i++)
            answer += absolutes[i] * (signs[i]? 1: -1);
        return answer;
    }
}
