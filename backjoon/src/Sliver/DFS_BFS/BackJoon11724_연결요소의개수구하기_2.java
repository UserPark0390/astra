package Sliver.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon11724_연결요소의개수구하기_2{

	static int A [][];
	static boolean visited [];
	static int N, M, count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		A = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			A[x][y] = 1;
			A[y][x] = 1;
			
		}
		count = 0;
		for(int i = 1; i <= N; i++) {
			if(visited[i] == false) {
				DFS(i);
				count++;
			}
		}
		System.out.println(count);
	}

	private static void DFS(int v) {
		if(visited[v] == true) {
			return;
		}
		visited[v] = true;
		for(int i = 1; i <= N; i++) {
			if(A[v][i] == 1) {
				DFS(i);
			}
		}
	}
}
