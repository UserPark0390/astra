package level0.different;

import java.util.Arrays;

public class Programmers_캐릭터의좌표 {
	   private static String up = "up";
	    private static String down = "down";
	    private static String left = "left";
	    private static String right = "right";
	    private static int xPos = 0;
	    private static int yPos = 1;
	    private static int maxWidth = 0;
	    private static int maxHeight= 0;
	    static int[] answer = {0, 0};
	    
	public static void main(String[] args) {
		String[] keyinput =  {"down", "down", "down", "down", "down", "up"};
		int[] board = {7, 9};		
		System.out.println(Arrays.toString(solution(keyinput, board)));
	}
    public static int[] solution(String[] keyinput, int[] board) {
        maxWidth = board[xPos] / 2;
        maxHeight = board[yPos] / 2;
        for (String moveKey : keyinput) {
            move(moveKey);
        }
        return answer;
    }
    private static void move(String key) {
        if (up.equals(key)) {
            // up
            moveUp();
        } else if (down.equals(key)) {
            // down
            moveDown();
        } else if (left.equals(key)) {
            // left
            moveLeft();
        } else {
            // right
            moveRight();
        }
    }

    private static void moveUp() {
        int top = Math.abs(maxHeight);
        if (answer[yPos] + 1 <= top) {
            answer[yPos]++;
        };
    }

    private static void moveDown() {
        int bottom = Math.abs(maxHeight) * -1;
        if (answer[yPos] - 1 >= bottom) {
            answer[yPos]--;
        };
    }

    private static void moveLeft() {
        int left = Math.abs(maxWidth) * -1;
        if (answer[xPos] - 1 >= left) {
            answer[xPos]--;
        };
    }

    private static void moveRight() {
        int right = Math.abs(maxWidth);
        if (answer[xPos] + 1 <= right) {
            answer[xPos]++;
        };
    }
	
}
