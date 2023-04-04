package Sliver.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BackJoon2178_미로탐색하기 {
	
	static int [] dx = {0,1,0,-1};  
	static int [] dy = {1,0,-1,0};
	// (0,1) 이면 배열에서는 아래를 탐색
	// (1,0) 이면 배열에서는 오른쪽을 탐색
	// (0,-1) 이면 배열에서는 위를 탐색
	// (-1,0) 이면 배열에서는 왼쪽을 탐색
	static boolean [][] visited;
	static int [][] A ;
	static int N, M;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		A = new int [N][M];
		visited = new boolean[N][M];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			// 값 넣기
			for(int j = 0; j < M; j++) { 
				A[i][j] = Integer.parseInt(line.substring(j,j+1)); 
			}
		}
		BFS(0,0);
		// index가 0부터 시작되기 때문이다.
		System.out.println(A[N-1][M-1]);
		
	}
	private static void BFS(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int [] {i,j});
		visited[i][j] = true; // 시작점을 넣을 때만 true로
		while(!queue.isEmpty()){
			int now[] = queue.poll();
			// 인덱스 4번 돌게 한 것은 상하좌우 탐색
			for(int k = 0; k < 4; k++) {  
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				if(x >= 0 && y >= 0 && x < N && y < M) { // 배열을 넘기면 안 되고
					if(A[x][y] != 0 && !visited[x][y]) { // 0이어서 갈 수 없거나 기방문한 곳이면 안 된다.
						// 이제 갈 수 있는 곳이다.
						visited[x][y] = true;
						// 핵심 (depth를 넣어주는 것)
						A[x][y] = A[now[0]][now[1]] + 1;
						queue.add(new int[] {x,y});
					}
				}
			}
		}
		
	}
}
