package level0.solution;

public class Programmers_안전지대 {
	public static void main(String[] args) {
		int[][] board = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1 } };

		System.out.println(solution(board));
	}

	public static int solution(int[][] board) {
		 int answer = 0;
	        boolean mine[][] = new boolean[board.length][board.length];
	        
	        for(int row = 0; row < mine.length; row++) {
	            for(int col = 0; col < mine.length; col++) {
	                if(board[row][col] == 1) Dangerous(col, row, board.length, mine);
	            }
	        }
	        
	        for(int i = 0; i < mine.length; i++) {
	            for(int j = 0; j < mine.length; j++) {
	                if(mine[i][j] == false) answer++;
	            }
	        }
			return answer;
			
	}
	  private static void Dangerous(int col, int row, int n, boolean[][] mine) {
	        for(int r = row-1; r < row+2; r++) {
	            if(r < 0 || r >= n) continue;
	            else {
	                for(int c = col-1; c < col+2; c++) {
	                    if(c < 0 || c >= n) continue;
	                    else mine[r][c] = true;
	                }
	            }
	        }
	    }
}
