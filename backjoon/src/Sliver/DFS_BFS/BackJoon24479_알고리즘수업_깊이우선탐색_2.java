package Sliver.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BackJoon24479_알고리즘수업_깊이우선탐색_2{
	static ArrayList<ArrayList<Integer>> graph;
	static int [] sequance;
	static boolean [] visited;
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken()); // 정점의 수
		int M = Integer.parseInt(st.nextToken()); // 간선의 수
		int R = Integer.parseInt(st.nextToken()); // 시작 정점
		
		graph = new ArrayList<>();
		sequance = new int[N+1]; // 정점의 수를 배열로 
		visited = new boolean[N+1]; // 방문여부 체크
		
		for(int i = 0; i <= N; i++){
			graph.add(new ArrayList<>()); // 
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph.get(a).add(b);
			graph.get(b).add(a);			
		}
		
		for(int i = 1; i <= N; i++) {
			Collections.sort(graph.get(i));
			sequance[R] = 1;
			visited[R] = true;
			count = 2;
			DFS(R);
		}
		for(int i = 1; i <= N; i++) {
			sb.append(sequance[i] + "\n");
		}
		System.out.println(sb);
	}

	private static void DFS(int r) {
		for(int v : graph.get(r)) {
			if(!visited[v]) {
				sequance[v] = count++;
				visited[v] = true;
				DFS(v);
			}
		}
		
	}
}
