package Sliver;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class BackJoon7785 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 첫째 줄 로그에 기록된 출입 기록의 수 n

		HashMap<String, String> map = new LinkedHashMap<>(); // 타입 파라미터 생략 가능 // treemap
		
		for (int i = 0; i < N; i++) {
			String Key= sc.next(); // 사람의 이름
			String Value = sc.next(); // "enter"나 "leave"가 주어진다. "enter"인 경우는 출근, "leave"인 경우는 퇴근

			map.put(Key, Value);
			if(map.get(Key).equals("leave")) {
				map.remove(Key);
			}
		}
//		TreeMap<String, String> tm = new TreeMap<>(map);
//	      Set<String> keyset = map.keySet();
//	      
//	      Iterator<String> keyiterator = tm.descendingKeySet().iterator(); //키값 내림차순 정렬
//
//	      String k;
//	      String v;
//	      
//	      while(keyiterator.hasNext()) {
//	         k = (String)keyiterator.next();
//	         v = (String)tm.get(k);
//	         System.out.println(k);
//	      }
		//map.keySet().stream().forEach(System.out::println);
		for(String key : map.keySet()){
			System.out.println(key);
		}


		
	} // main end
}
