package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BackJoon1427_소트인사이드 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		PriorityQueue<Integer> p_q = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i = 0; i < str.length(); i++) {		
			p_q.add(Character.getNumericValue(str.charAt(i)));
		}		
		for(int i = 0; i < str.length(); i++) {
			sb.append(p_q.poll());
		}
		System.out.println(sb);
		
	}
}
