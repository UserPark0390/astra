package Sliver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class BackJoon17219 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int M = sc.nextInt();
	//	String value = "";
		
//		HashMap<String, String> map = new HashMap<String, String>();
		TreeMap<String, String> map = new TreeMap<String, String>();
		for(int i = 0; i < N; i++) {
			String key = sc.next();
			String value = sc.next();
			map.put(key, value);
		}
		
//		ArrayList<String> list = new ArrayList<String>();
		
		
		for(int i = 0; i < M; i++) {
			String key = sc.next();
			if(map.containsKey(key)) {
				String tmp = map.get(key);
//				list.add(tmp);
				System.out.println(tmp);
			}
			
		}
//		System.out.println("list : " + list);
		
//		for(String value : map.values()){
//			System.out.println(value);
//		}


	
	}
}
