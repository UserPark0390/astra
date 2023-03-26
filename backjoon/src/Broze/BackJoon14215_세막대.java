package Broze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class BackJoon14215_세막대 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		List<Integer> list = new LinkedList<>();
		list.add(a);
		list.add(b);
		list.add(c);		
		Collections.sort(list);
		if(list.get(0) + list.get(1) > list.get(2)) {
			System.out.println(a+b+c);
		} else {
			System.out.println((list.get(0) + list.get(1)) * 2 - 1 );
		}
		
	
	}
}
