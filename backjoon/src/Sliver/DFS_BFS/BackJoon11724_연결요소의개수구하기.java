package Sliver.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BackJoon11724_연결요소의개수구하기 {
	
	static boolean visited [];
	static ArrayList<Integer> [] list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		visited = new boolean[N+1];
		
		list = new ArrayList[N+1];
		for(int i = 1; i < N+1; i++) {
			list[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken()); // 시작점
			int e = Integer.parseInt(st.nextToken()); // 종료점
			// 양쪽 방향으로 더해줌
			list[s].add(e);
			list[e].add(s);
			
		}
		int count = 0;
		for(int i = 1; i < N; i++) {
			if(!visited[i]) {
				count++;
				DFS(i);
			}
		}
		
	System.out.println(count);	
	}
	
	private static void DFS(int v) {
		if(visited[v]) {
			return;
		}
		visited[v] = true;
		for(int i : list[v]) {
			if(!visited[i]) {
				DFS(i);
			}
		}
	}
	
}
