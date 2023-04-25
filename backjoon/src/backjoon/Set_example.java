package backjoon;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_example {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("H");
		set.add("A");
		set.add("N");
		set.add("B");
		set.add("O");
		set.add("E");
		
		Iterator<String> iterator = set.iterator(); // Iterator 사용
		
		System.out.println("----------- Set 안에 데이터 확인 --------------");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		set.remove("H"); // "H" 삭제
		
		iterator = set.iterator(); // Iterator 재선언
		
		System.out.println("----------- 재선언한 Set 안에 데이터 확인 --------------");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}		
	}
}
