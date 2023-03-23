package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class BackJoon1966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(st.nextToken()); // 테스트케이스
		
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			LinkedList<Integer> list = new LinkedList<>();
			int N = Integer.parseInt(st.nextToken()); // 
			int M = Integer.parseInt(st.nextToken());
			int count = 0;
			st = new StringTokenizer(br.readLine());
			for(int i = 1; i <= N; i++){				
				int number = Integer.parseInt(st.nextToken());
				list.add(number);
			}
			
			while(!list.isEmpty()) {
				boolean check = true; // 문서 체크
				for(int i = 0; i < list.size(); i++) {
					if(list.peek() < list.get(i)) {
						check = false;
						break;						
					}
				}	
				if(check) {
					count++;
					list.poll();
					if(M == 0) {
						break;
					} else {
						M--;
					}
				} else {
					int tmp = list.poll();
					list.add(tmp);
					
					if(M == 0) {
						M = list.size() -1; 
					} else {
						M -= 1;
					}
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
		br.close();		
	}
}
