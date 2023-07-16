package level1.level1_different;

public class Programmers_행렬의덧셈2 {
	    int[][] sumMatrix(int[][] A, int[][] B) {
	        int rowLength = Math.max(A.length, B.length);
	        int colLength = Math.max(A[0].length, B[0].length);

	        int[][] answer = new int[rowLength][colLength];

	        for(int i=0; i<rowLength; i++) {
	            for(int j=0; j<colLength; j++) {
	                answer[i][j] = A[i][j]+B[i][j];
	            }
	        }
	        return answer;
	    }

	    // 아래는 테스트로 출력해 보기 위한 코드입니다.
	    public static void main(String[] args) {
	    	Programmers_행렬의덧셈2 c = new Programmers_행렬의덧셈2();
	        int[][] A = { { 1, 2 }, { 2, 3 } };
	        int[][] B = { { 3, 4 }, { 5, 6 } };
	        int[][] answer = c.sumMatrix(A, B);
	        if (answer[0][0] == 4 && answer[0][1] == 6 && 
	                answer[1][0] == 7 && answer[1][1] == 9) {
	            System.out.println("맞았습니다. 제출을 눌러 보세요");
	        } else {
	            System.out.println("틀렸습니다. 수정하는게 좋겠어요");
	        }
	    }
}
