package level0.solution;

import java.util.Arrays;

public class Programmers_캐릭터의좌표 {
	public static void main(String[] args) {
		String[] keyinput =  {"down", "down", "down", "down", "down", "up"};
		int[] board = {7, 9};		
		System.out.println(Arrays.toString(solution(keyinput, board)));
	}
    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int [board.length];
        for(int i = 0; i < keyinput.length; i++) {
        	switch (keyinput[i]) {
			case "left":
				if(answer[0] > (board[0]/2*-1) && answer[0] <= board[0]/2) {
					answer[0] += -1;
				}
				break;
			case "right":
				if(answer[0] >= (board[0]/2*-1) && answer[0] < board[0]/2) {
					answer[0] += 1;
				}
				break;
			case "up":
				if(answer[1] >= (board[1]/2*-1) && answer[1] < board[1]/2) {
					answer[1] += 1;
				}
				break;
			case "down":
				if(answer[1] > (board[1]/2*-1) && answer[1] <= board[1]/2) {
					answer[1] += -1;
				}
				break;
			}
        	
        }      
        return answer;
    }
	
}
