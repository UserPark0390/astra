package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BackJoon18870_좌표압축 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int a [] = new int [N]; // 원본
		int sort_a [] = new int[N]; // 정렬하기 위한 원본 복제
		Map<Integer, Integer> map = new HashMap<>(); // 순위를 매길 map
		
		st = new StringTokenizer(br.readLine()); 
		for(int i = 0; i < N; i++) { 
			// 값 넣기
			a[i] = sort_a[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(sort_a);  // 정렬용 복제를 정렬
		
		int ranking = 0;
		for(int i : sort_a) {
			// 체크한 앞선 원소가 있을 경우 제외
			if(!map.containsKey(i)) {  
				map.put(i, ranking);
				ranking++; 
			}
		}
		int check = 0;
		for(int i : a) {
			// 원본에 대한 순위를 갖고 온다
			check = map.get(i);
			sb.append(check).append(" ");
		}
		System.out.println(sb);
		
	}
}
