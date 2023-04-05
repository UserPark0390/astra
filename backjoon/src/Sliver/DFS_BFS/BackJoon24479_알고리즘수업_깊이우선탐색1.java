package Sliver.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BackJoon24479_알고리즘수업_깊이우선탐색1 {

	static int result[] = new int[10001];
	static int count = 0; // 순서 카운팅
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		LinkedList<Integer> [] list = new LinkedList[N+1];
		
		for(int i = 1; i <= N; i++) {
			list[i] = new LinkedList<>();
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			list[u].add(v);		
			list[v].add(u);
		}
		
		for(int i = 0; i < N; i++) {
			Collections.sort(list[i]);
		}
		
		boolean[] visited = new boolean[N+1];
		
		DFS(R, list, visited);
		
		for(int i = 1; i <= N; i++) {
			sb.append(result[i]).append("\n");
		}
		sb.deleteCharAt(sb.length() -1);
		System.out.println(sb);
		
	}

	private static void DFS(int r, LinkedList<Integer>[] list, boolean[] visited) {
		Iterator<Integer> iterator = list[r].listIterator();
		visited[r] = true;
		result[r] = ++count;
		
		while(iterator.hasNext()) {
			int check = iterator.next();
			if(!visited[check]) {
				DFS(check, list, visited);
			}
		}
		
	}


	
}
