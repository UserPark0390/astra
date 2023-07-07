package level1.level1_solution;

public class Programmers_최소직사각형 {
	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		System.out.println(solution(sizes));
	}
	
    public static int solution(int[][] sizes) {
        int answer = 0;
        int check_A = 0;
        int check_B = 0;
        
        for(int i = 0; i < sizes.length; i++) {
        	if(sizes[i][0] > check_A) {
        		check_A = sizes[i][0];        		
        	}
        	if(sizes[i][1] > check_B) {
        		check_B = sizes[i][1];
        	}
        }
        answer = check_A * check_B;
        
        return answer;
    }
}
