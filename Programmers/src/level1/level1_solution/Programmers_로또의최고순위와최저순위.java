package level1.level1_solution;

public class Programmers_로또의최고순위와최저순위 {
	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};  
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		System.out.println(solution(lottos, win_nums));
	}
	
    public static int[] solution(int[] lottos, int[] win_nums) {
    	int highrank = 0;
    	int lowrank = 0;
    	
        int[] answer = {highrank, lowrank};
        return answer;
    }
}
